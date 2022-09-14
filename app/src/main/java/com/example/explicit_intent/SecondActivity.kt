package com.example.explicit_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var ttextview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent=getIntent()
        ttextview=findViewById(R.id.textview1)
        var m1:String?=intent.getStringExtra("MainActivity")
        ttextview.text=m1
    }
}