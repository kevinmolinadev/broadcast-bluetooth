# Monitoreo de Conexiones Bluetooth en Android

Este proyecto muestra cómo monitorear las conexiones Bluetooth en una aplicación Android utilizando Java y Android Studio. El objetivo es detectar cuándo un dispositivo se conecta a través de Bluetooth y mostrar esta información en un TextView en la interfaz de usuario.

## Requisitos

- Android Studio instalado en tu sistema.
- Un dispositivo Android o un emulador configurado.

## Pasos para el Proyecto

### 1. Configuración del Proyecto

- Abre Android Studio y crea un nuevo proyecto de Android.
- Asegúrate de que tu dispositivo Android esté conectado o utiliza un emulador.

### 2. Agregar Permisos

- Abre el archivo `AndroidManifest.xml`.
- Añade los permisos necesarios para Bluetooth, como `BLUETOOTH` y `BLUETOOTH_ADMIN`.

### 3. Crear la Interfaz de Usuario

- Diseña la interfaz de usuario de tu aplicación, que incluya un `TextView` para mostrar la información del dispositivo conectado.

### 4. Gestionar Bluetooth

- En tu actividad principal (por ejemplo, `MainActivity.java`), inicializa el adaptador Bluetooth y habilita Bluetooth si no está habilitado.

### 5. Registrar un BroadcastReceiver

- Crea un BroadcastReceiver para detectar las conexiones Bluetooth y actualiza el TextView con la información del dispositivo conectado.

### 6. Registrar el BroadcastReceiver en tu Actividad

- En el método `onCreate` de tu actividad, registra el BroadcastReceiver para escuchar eventos de conexión Bluetooth.



