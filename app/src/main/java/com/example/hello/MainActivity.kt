package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowToast = findViewById<Button>(R.id.btnShowToast)
        btnShowToast.setOnClickListener  {
            Log.i("MainActivity", "Button was clicked !")

            val text = "Button was clicked !"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(this, text, duration)
            toast.show()
        }

        val btnSendToSecondActivity = findViewById<Button>(R.id.sendButtonToSecondActivity)
        btnSendToSecondActivity.setOnClickListener {
            val message = btnSendToSecondActivity.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
    fun main() {
        println("Hello World!")
    }
}