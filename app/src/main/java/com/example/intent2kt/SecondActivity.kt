package com.example.intent2kt

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.intent2kt.model.Member

class SecondActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val res = findViewById<TextView>(R.id.res)
        val exit = findViewById<Button>(R.id.exit)
        val member = Member("Vali",26)



        val user = intent.getSerializableExtra("user")

        exit.setOnClickListener {
            val intent = Intent()
            intent.putExtra("member",member)
            setResult(RESULT_OK,intent)
            finish()
        }

        res.setText(user.toString())
    }
}