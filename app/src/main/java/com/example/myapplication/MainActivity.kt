package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("for looop practine")
        println()
        for (i in 1..5)print(i)

        println()
        for (i in 10 downTo 1)  println(" $i ")

        println()

    }
}