package com.example.exercise2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_vocabulary.*

class Vocabulary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vocabulary)

        btnBack.setOnClickListener {
            val intent : Intent = Intent(applicationContext, Vocabulary::class.java)
            startActivity(intent)
        }
    }


}