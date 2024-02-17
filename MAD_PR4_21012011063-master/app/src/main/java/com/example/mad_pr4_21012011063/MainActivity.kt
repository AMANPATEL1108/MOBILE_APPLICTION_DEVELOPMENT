package com.example.mad_pr4_21012011063

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login: Button = findViewById(R.id.login)
        login.setOnClickListener {
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }

        val signup:Button = findViewById(R.id.signup)
        signup.setOnClickListener {
            Intent(this,RegistationActivity::class.java).also { startActivity(it) }
        }

    }
}