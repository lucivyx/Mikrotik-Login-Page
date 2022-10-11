package com.example.ujikom

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    var tombol: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tombol = findViewById<View>(R.id.button) as Button
        tombol!!.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Ini adalah Contoh Toast di Android!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
