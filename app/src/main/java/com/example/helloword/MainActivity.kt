package com.example.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var helloTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById<TextView>(R.id.helloTextView)
        helloTextView!!.text = "Seja bem vindo ao Delivery Now"

        helloTextView!!.setOnClickListener {
            Toast.makeText(applicationContext,
                "Aguarde enquanto o sistema identifica a sua identidade",
                Toast.LENGTH_LONG).show()
        }
    }
}