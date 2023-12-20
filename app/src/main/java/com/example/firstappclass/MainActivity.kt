package com.example.firstappclass

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT ){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }
        val btnClick: Button = findViewById(R.id.button)
        val text = findViewById<View>(R.id.edit_text) as EditText

        val str: TextView = findViewById(R.id.textView)
        btnClick.setOnClickListener {
            val text2 = text.text.toString()
            str.setText(text2).toString()
        }


    }
}