package com.example.pulseplus

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class makerequest : AppCompatActivity() {
    lateinit var message: EditText
    private val PICK_IMAGE_REQUEST=1
    lateinit var imageView: ImageView

    lateinit var request: Button
    lateinit var txtv: TextView
    lateinit var auth: FirebaseAuth
    lateinit var upload: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makerequest)
        message = findViewById(R.id.edt_message)
        imageView= findViewById(R.id.imageView)
        request= findViewById(R.id.request)
        upload= findViewById(R.id.btnUpload)
        txtv= findViewById(R.id.text_m)
        auth = Firebase.auth


        upload.setOnClickListener {
            openFileChooser()
        }


    }private fun openFileChooser(){
        val intent =Intent()
        intent.type="image/*"
        intent.action=Intent.ACTION_GET_CONTENT
        startActivity(intent,PICK_IMAGE_REQUEST)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==PICK_IMAGE_REQUEST&&resultCode==Activity.RESULT_OK&& data!=null&&data.data!=null){
            val imageUri:Uri=data.data!!
            val imageBitmap:Bitmap=MediaStore.Images.Media.getBitmap(contentResolver,imageUri)
            imageView.setImageBitmap(imageBitmap)
        }
    }
}