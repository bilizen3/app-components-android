package com.flores.appcomponentsandroid.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.appcomponentsandroid.R

class ComponentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component)
    }
}
