package com.example.hackaton2023v2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.hackaton2023v2.Gallery
import com.example.hackaton2023v2.R

class MoodSelector : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood_selector)


        val button_positif = findViewById<ImageButton>(R.id.button_positif)
        val button_negatif = findViewById<ImageButton>(R.id.button_negatif)

        button_positif.setOnClickListener(View.OnClickListener { startActivity(Intent(this,GratefulStatement::class.java)) })
        button_negatif.setOnClickListener(View.OnClickListener { startActivity(Intent(this,Gallery::class.java)) })
    }
}