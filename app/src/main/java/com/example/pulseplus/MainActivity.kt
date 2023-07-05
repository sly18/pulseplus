package com.example.pulseplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {
    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var city: EditText
    lateinit var emailaddress: EditText
    lateinit var bloodgroup: EditText
    lateinit var phonenumber: EditText
    lateinit var register: Button
    lateinit var lodination: TextView
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.edt_user)
        password = findViewById(R.id.edt_pass)
        city = findViewById(R.id.edt_city)
        emailaddress = findViewById(R.id.edt_email)
        bloodgroup = findViewById(R.id.edt_blood)
        phonenumber = findViewById(R.id.edt_phone)
        register = findViewById(R.id.but_reg)
        lodination = findViewById(R.id.txt_reg)
        auth = Firebase.auth

        lodination.setOnClickListener {
            val reg = Intent(this, login::class.java)
            startActivity(reg)
        }

        register.setOnClickListener {
            val NM = Intent(this, Homepage::class.java)
            startActivity(NM)
        }

    }
}









