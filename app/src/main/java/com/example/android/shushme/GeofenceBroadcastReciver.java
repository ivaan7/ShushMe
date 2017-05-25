package com.example.android.shushme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class GeofenceBroadcastReciver extends BroadcastReceiver {
    public GeofenceBroadcastReciver() {
    }

    public static final String TAG = GeofenceBroadcastReciver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onRecive called");
    }
}
