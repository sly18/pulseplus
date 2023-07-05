package com.example.pulseplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class login : AppCompatActivity() {
    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var button: Button
    lateinit var emailaddress: EditText
    lateinit var TEXT: TextView
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        username=findViewById(R.id.edt_username)
        password=findViewById(R.id.edt_Password)
        button=findViewById(R.id.but_login)
        emailaddress=findViewById(R.id.edt_EmailAddress)
        TEXT=findViewById(R.id.text_log)
        auth = Firebase.auth

        button.setOnClickListener {
            val reg = Intent(this, Homepage::class.java)
            startActivity(reg)}

        TEXT.setOnClickListener {
            val LO = Intent(this, MainActivity::class.java)
            startActivity(LO)}
        }
    }
