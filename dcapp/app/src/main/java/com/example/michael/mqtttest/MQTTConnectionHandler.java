package com.example.michael.mqtttest;

import android.util.Log;

import org.eclipse.paho.android.service.MqttService;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;

/**
 * @desc - This is the callback class used to handle connection events from a
 *         MQTT client. It's current just a stub but it could provide some
 *         functionality if we need it later. (A call back class is needed
 *         by MQTTclient to establish a connection).
 */
public class MQTTConnectionHandler implements IMqttActionListener {
    @Override
    public void onSuccess(IMqttToken iMqttToken) {
        BroadcastService.connectionStatus = "Connected";
        BroadcastService.isConnecting = false;
        Log.i("test", "I CONNECTED!!!");
    }

    @Override
    public void onFailure(IMqttToken iMqttToken, Throwable throwable) {
        BroadcastService.connectionStatus = "Disconnected";
        BroadcastService.isConnecting = false;
        Log.i("test", throwable.getMessage());
        Log.i("test", "----------I failed-------!!!");

    }
}
