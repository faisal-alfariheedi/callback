package com.example.callback

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showToast(this,"onCreate Activity 2")
        Log.d("Activity2", "onCreate:")
        val st3act = findViewById<Button>(R.id.act3)
        st3act.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        showToast(this,"onStart Activity 2")
        Log.d("Activity2", "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume Activity 2")
        Log.d("Activity2", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Activity 2")
        Log.d("Activity2", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Activity 2")
        Log.d("Activity2", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Activity 2")
        Log.d("Activity2", "onDestroy: ")
    }

    fun showToast(context: Context, state:String)
    {
        Toast.makeText(context,state, Toast.LENGTH_SHORT).show()
    }
}