package com.example.socialappiieacedu

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale
import java.util.Locale.getDefault

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Declarations

        val etTime = findViewById<EditText>(R.id.etTime)
        val btnSocial = findViewById<Button>(R.id.btnSocial)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnSocial.setOnClickListener {
            val result = etTime.text.toString()
            if (result.isEmpty()) {
                tvResult.text = "Enter time of day"
            }else when (result.trim().lowercase(getDefault())) {
                "morning" -> {
                    tvResult.text = "Send morning text"
                    tvResult.text = "Go to uncles or family"
                    tvResult.text = "Meet up with friends "
                }

                "afternoon" -> {
                    tvResult.text = "Send afternoon text"
                    tvResult.text = "Go out for lunch with friends"
                    tvResult.text = "Visit a friend "
                }

                "evening" -> {
                    tvResult.text = "Send evening text"
                    tvResult.text ="Send goodnight text"
                }

                else -> tvResult.text = "Enter time of day"


            }
                 btnReset.setOnClickListener {
                     var reset = etTime.text.toString()
                     if (reset.isNotBlank()){
                         tvResult.text = ""
                     }
                 }
                }
            }
        }
