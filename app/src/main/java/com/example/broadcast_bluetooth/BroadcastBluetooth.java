package com.example.broadcast_bluetooth;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class BroadcastBluetooth extends BroadcastReceiver {
    private TextView textView;

    public BroadcastBluetooth(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (BluetoothDevice.ACTION_ACL_CONNECTED.equals(action)) {
            // Se ha conectado un dispositivo Bluetooth
            BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
            // Obtenemos informacion del dispositivo conectado
            String deviceName = device.getName();
            String deviceAddress = device.getAddress();
            // Actualiza el TextView con la información del dispositivo conectado
            textView.setText("Dispositivo Conectado\n" + deviceName + " (" + deviceAddress + ")");
        } else if (BluetoothDevice.ACTION_ACL_DISCONNECTED.equals(action)) {
            // Se ha desconectado un dispositivo Bluetooth
            BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
            String deviceName = device.getName();
            String deviceAddress = device.getAddress();
            // Actualiza el TextView con la información del dispositivo desconectado
            textView.setText("Ultima Conexion\n" + deviceName + " (" + deviceAddress + ")");
        }
    }
}
