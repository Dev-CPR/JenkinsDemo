package com.cpr.jenkinsdemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast

private const val TAG = "MyService"
class MyService : Service() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate: calls onCreate message")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onBind(intent: Intent): IBinder {
        return onBind(intent)
    }
}