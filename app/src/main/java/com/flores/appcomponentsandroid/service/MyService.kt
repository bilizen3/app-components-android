package com.flores.appcomponentsandroid.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.media.MediaPlayer
import android.provider.Settings


class MyService : Service() {

    private var player: MediaPlayer? = null


    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player = MediaPlayer.create(
            this,
            Settings.System.DEFAULT_RINGTONE_URI
        )
        player?.isLooping = true
        player?.start()

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        player?.stop()
    }

}