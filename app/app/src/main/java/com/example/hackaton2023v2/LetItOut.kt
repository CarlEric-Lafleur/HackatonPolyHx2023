package com.example.hackaton2023v2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.hackaton2023v2.GratefulStatement
import com.example.hackaton2023v2.R

class LetItOut : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_let_it_out)

        val button = findViewById<Button>(R.id.button)
        val back = findViewById<Button>(R.id.back)

        button.setOnClickListener(View.OnClickListener { startActivity(Intent(this,
            GratefulStatement::class.java)) })
        back.setOnClickListener(View.OnClickListener { startActivity(Intent(this,
            MoodSelector::class.java)) })
    }
}