package com.example.pulseplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class Homepage : AppCompatActivity() {
    lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        toolbar=findViewById(R.id.tool_bar)
        toolbar.setOnClickListener {


        }

    }
}