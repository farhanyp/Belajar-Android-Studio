package com.yp.myapplication

import android.app.Application
import android.util.Log

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.i("CREATE", " Ini On Create")
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.i("TERMINATE", " Ini On TERMINATE")
    }
}