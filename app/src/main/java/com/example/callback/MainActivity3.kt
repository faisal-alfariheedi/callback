package com.example.callback

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        showToast(this,"onStart Activity 3")
        Log.d("Activity3", "onStart: ")
        val st1act = findViewById<Button>(R.id.act1)
        st1act.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        showToast(this,"onStart Activity 3")
        Log.d("Activity3", "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume Activity 3")
        Log.d("Activity3", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Activity 3")
        Log.d("Activity3", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Activity 3")
        Log.d("Activity3", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Activity 3")
        Log.d("Activity3", "onDestroy: ")
    }

    fun showToast(context: Context, state:String)
    {
        Toast.makeText(context,state, Toast.LENGTH_SHORT).show()
    }

}