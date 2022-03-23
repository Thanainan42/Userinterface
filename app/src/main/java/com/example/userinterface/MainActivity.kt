package com.example.userinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userinterface = findViewById<Button>(R.id.button_back2)
        userinterface.setOnClickListener {
            val Intent = Intent(this,process::class.java)
            startActivity(Intent)
        }

    }
}