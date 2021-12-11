package com.example.markhaevaelvirafinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val button: Button =findViewById (R.id.btnNoo)
        button.setOnClickListener {
            intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}