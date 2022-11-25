package com.example.app2

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Button
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_suma = findViewById(R.id.btn_suma) as Button
        val btn_resta = findViewById(R.id.btn_resta) as Button
        val btn_division = findViewById(R.id.btn_division) as Button
        val btn_multi = findViewById(R.id.btn_multi) as Button

        btn_suma.setOnClickListener{
            Toast.makeText(this@MainActivity,"You clicked +.", Toast.LENGTH_SHORT).show()
            /*val vibrator = this@MainActivity.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if(Build.VERSION.SDK_INT>=26) {
                vibrator.vibrate(VibrationEffect.createOneShot(2000, VibrationEffect.DEFAULT_AMPLITUDE))
            }else{
                vibrator.vibrate(200)
            }*/
        }
        btn_resta.setOnClickListener {
            Toast.makeText(this@MainActivity,"You clicked -.", Toast.LENGTH_SHORT).show()

        }
        btn_division.setOnClickListener {
            Toast.makeText(this@MainActivity,"You clicked /.", Toast.LENGTH_SHORT).show()

        }
        btn_multi.setOnClickListener {
            Toast.makeText(this@MainActivity,"You clicked x.", Toast.LENGTH_SHORT).show()

        }
    }
}