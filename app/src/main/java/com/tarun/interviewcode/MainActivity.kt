package com.tarun.interviewcode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var sum=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sum=10+23
        var button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            println("Check $sum")
            Toast.makeText(this,"Hello Welcome to this project",Toast.LENGTH_LONG).show()
        }
    }
}
