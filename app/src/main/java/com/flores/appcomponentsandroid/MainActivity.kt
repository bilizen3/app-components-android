package com.flores.appcomponentsandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.appcomponentsandroid.activity.ComponentActivity
import com.flores.appcomponentsandroid.service.ServicesActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnActivity.setOnClickListener {
            startActivity(Intent(this, ComponentActivity::class.java))
        }

        btnService.setOnClickListener {
            startActivity(Intent(this, ServicesActivity::class.java))
        }

    }
}
