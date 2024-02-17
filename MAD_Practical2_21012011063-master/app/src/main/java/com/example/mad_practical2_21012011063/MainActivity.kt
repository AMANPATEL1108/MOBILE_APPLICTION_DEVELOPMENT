package com.example.mad_practical2_21012011063

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMsg("oncreate method is called")
    }

    override fun onStart() {
        super.onStart()
        showMsg("onstart method is called!")
    }

    override fun onResume() {
        super.onResume()
        showMsg("onresume method is called!")
    }

    override fun onPause() {
        super.onPause()
        showMsg("Onpause method is called!")
    }

    override fun onStop() {
        super.onStop()
        showMsg("onstop method is called!")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMsg("ondestroy method is called!")

    }

    override fun onRestart() {
        super.onRestart()
        showMsg("onrestart method called!")
    }
    fun showMsg(message:String) {
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val constraint: ConstraintLayout? = findViewById(R.id.mainConstraint)
        if (constraint != null){
            Snackbar.make(constraint,message,Snackbar.LENGTH_SHORT).show()
        }


    }
}