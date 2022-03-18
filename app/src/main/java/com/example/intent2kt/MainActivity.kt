package com.example.intent2kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.intent2kt.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user = User("Ali",34)

        val send = findViewById<Button>(R.id.send)

        var intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("user", user)

        send.setOnClickListener {
            startActivity(intent)
        }
    }
}