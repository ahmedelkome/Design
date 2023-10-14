package com.ahmed.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

 class MainActivity : AppCompatActivity() {
    lateinit var emailEt : EditText
    lateinit var passEt: EditText
    lateinit var join : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        description()


        join.setOnClickListener {
            var Email = emailEt.text.toString()
            var Pass= passEt.text.toString()
            var text = "Hello your email : $Email \n your password : $Pass"
            var myintent = Intent(this,Second_activity::class.java)
            myintent.putExtra("Data",text)
            startActivity(myintent)

        }

    }
    private fun description () {
        emailEt = findViewById(R.id.email)
        passEt = findViewById(R.id.pass)
        join = findViewById(R.id.join)

    }
}