package com.example.markhaevaelvirafinal

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:  Button=findViewById(R.id.btnThx)
        button.setOnClickListener {
            /*val address = Uri.parse("https://www.google.ru/")
            val openlink = Intent(Intent.ACTION_VIEW, address)
            startActivity(openlink)*/
            intent= Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}