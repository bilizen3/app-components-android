package com.flores.appcomponentsandroid.contentProvider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.flores.appcomponentsandroid.R

class ContentProviderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_provider)
        var projection={ContactsContract.Data.}
        contentResolver.query()
    }
}
