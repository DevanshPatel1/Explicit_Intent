package com.example.explicit_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var mmessageedittext:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mmessageedittext=findViewById(R.id.edittext_name)
    }

    fun LaunchSecondActivity(view: View) {
        Toast.makeText(this,"Button: Button is clicked",Toast.LENGTH_LONG).show()
        Log.d("MainActivity","Button is Clicked")
        val intent=Intent(this,SecondActivity::class.java)
        var message = mmessageedittext.text.toString()
        intent.putExtra("MainActivity", message)
        startActivity(intent)
    }

}