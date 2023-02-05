package com.example.hackaton2023v2

import android.content.Context
import android.graphics.Movie
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.se.omapi.Reader
import android.widget.TextView
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import java.io.BufferedReader
import java.io.InputStream
import java.nio.file.Paths
import java.io.FileReader
import java.nio.charset.StandardCharsets




class Gallery : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)



        val date = intent.getStringExtra("date")
        val text = intent.getStringExtra("text")
        val entry = text.plus("\n").plus(date)
        val textView: TextView = findViewById(R.id.textView7) as TextView
            textView.text = entry
    }
}