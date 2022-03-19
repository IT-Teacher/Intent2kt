package com.example.intent2kt

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.intent2kt.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user = User("Ali",34)

        val send = findViewById<Button>(R.id.send)
        val home = findViewById<TextView>(R.id.tv1)



        val sendData = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){ result->
            if (result.resultCode== Activity.RESULT_OK){
                val data:Intent? = result.data
                val s = data!!.getSerializableExtra("member")
                home.text =s.toString()
            }
        }

        send.setOnClickListener {
            var intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("user", user)
            sendData.launch(intent)
        }
    }
}