package com.example.intent2kt

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val res = findViewById<TextView>(R.id.res)

        val user = intent.getSerializableExtra("user")

        res.setText(user.toString())
    }
}