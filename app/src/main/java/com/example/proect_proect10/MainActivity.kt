package com.example.proect_proect10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var pas : String  = "1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun namefun ( v: View) {
        var output: TextView = findViewById(R.id.login)
        var input: EditText = findViewById(R.id.pass)
        if (input.text.toString() == pas)
            output.setText(input.text.toString())

    }

    }








