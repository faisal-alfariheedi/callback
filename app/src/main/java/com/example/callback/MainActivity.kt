package com.example.callback

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast(this,"onCreate Activity 1")
        Log.d("Activity1", "onCreate:")
        val st2act = findViewById<Button>(R.id.act2)
        st2act.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        showToast(this,"onStart Activity 1")
        Log.d("Activity1", "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume Activity 1")
        Log.d("Activity1", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Activity 1")
        Log.d("Activity1", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Activity 1")
        Log.d("Activity1", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Activity 1")
        Log.d("Activity1", "onDestroy: ")
    }

    fun showToast(context: Context,state:String)
    {
        Toast.makeText(context,state,Toast.LENGTH_SHORT).show()
    }
}