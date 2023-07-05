package com.example.pulseplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class search : AppCompatActivity() {
    lateinit var help: TextView
    lateinit var choose: TextView
    lateinit var city: EditText
    lateinit var blood: TextView
    lateinit var group: EditText

    lateinit var Donor: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        help = findViewById(R.id.help)
        choose = findViewById(R.id.txchoose)
        city= findViewById(R.id.city)
        blood= findViewById(R.id.grp)
        group= findViewById(R.id.bloodgroup)
        Donor= findViewById(R.id.btnDonor)

    }
}