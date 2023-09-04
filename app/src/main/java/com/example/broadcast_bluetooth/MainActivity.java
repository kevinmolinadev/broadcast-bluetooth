package com.example.broadcast_bluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BroadcastBluetooth broadcastBluetooth;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView);
        if (broadcastBluetooth == null) {
            broadcastBluetooth = new BroadcastBluetooth(textView1);
            IntentFilter filter = new IntentFilter();
            filter.addAction(BluetoothDevice.ACTION_ACL_CONNECTED); // Escuchar la conexión
            filter.addAction(BluetoothDevice.ACTION_ACL_DISCONNECTED); // Escuchar la desconexión
            registerReceiver(broadcastBluetooth, filter);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(broadcastBluetooth);
    }
}