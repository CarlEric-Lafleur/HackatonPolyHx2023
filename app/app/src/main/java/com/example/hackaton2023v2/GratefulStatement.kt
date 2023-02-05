package com.example.hackaton2023v2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.hackaton2023v2.R
import java.time.LocalDateTime


class GratefulStatement : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grateful_statement)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.back2)

        button2.setOnClickListener(View.OnClickListener { startActivity(Intent(this,LetItOut::class.java))})
        button.setOnClickListener(View.OnClickListener {
            callActivity()
        })


    }

    private fun callActivity(){
        val text = findViewById<EditText>(R.id.edit_text)
        val userText = text.text.toString()
        val date = LocalDateTime.now()
        val dateString = date.toString()

        val intent = Intent(this,Gallery_scroll::class.java).also {
            it.putExtra("date",dateString)
            it.putExtra("text",userText)
            startActivity(it)
        }



    }
}