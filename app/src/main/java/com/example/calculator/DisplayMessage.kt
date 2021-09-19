package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessage : AppCompatActivity() {

    lateinit var resultShow : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        resultShow = findViewById(R.id.result_text_view_mush_show)

        val intent = intent
        val result = intent.getDoubleExtra("Result", 0.00)
        resultShow.text = result.toString()
    }
}