package com.ultramg.easybikepark

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var captureButton = findViewById(R.id.captureButton) as Button
        captureButton.setOnClickListener { _ ->
            var mintent = Intent (MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(mintent)
        }
    }
}
