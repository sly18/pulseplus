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


class Registration : AppCompatActivity() {
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
        setContentView(R.layout.activity_registration)
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
            val reg = Intent(this, MainActivity::class.java)
            startActivity(reg)}

            register.setOnClickListener {
                signup()
            }
    }
    private fun signup() {
        val email: String = emailaddress.text.toString()
        val pass: String = password.text.toString()


        if (email.isBlank() || pass.isBlank()) {
            Toast.makeText(this, "signed up successfully", Toast.LENGTH_LONG).show()
            finish()

        } else {
            Toast.makeText(this, "Failed to create user", Toast.LENGTH_LONG).show()
        }
    }
}