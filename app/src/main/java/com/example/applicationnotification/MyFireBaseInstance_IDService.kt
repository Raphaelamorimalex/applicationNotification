package com.example.applicationnotification

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MyFireBaseInstance_IDService : FirebaseInstanceIdService() {

    override fun onTokenRefresh() {
        Log.i("**newTokeService", FirebaseInstanceId.getInstance().token.toString())
    }
}