package com.flores.appcomponentsandroid.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.appcomponentsandroid.R
import kotlinx.android.synthetic.main.activity_services.*

class ServicesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        btnStartService.setOnClickListener {
            startService(Intent(this, MyService::class.java))
        }

        btnStopService.setOnClickListener {
            stopService(Intent(this, MyService::class.java))
        }
    }
}
