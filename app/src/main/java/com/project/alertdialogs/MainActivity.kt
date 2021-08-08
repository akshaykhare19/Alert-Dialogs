package com.project.alertdialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var customAlertButton: Button
    private lateinit var defaultAlertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customAlertButton = findViewById(R.id.custom_button)
        defaultAlertButton = findViewById(R.id.default_button)

        customAlertButton.setOnClickListener {

        }

        defaultAlertButton.setOnClickListener {

            val builder = AlertDialog.Builder(this)

            val input = EditText(this)
            builder.setView(input)

            builder.setTitle("Default Alert Dialog!!")
            builder.setMessage("Enter your name here")
            builder.setPositiveButton("Toast My Name") { dialog, _ ->
                Toast.makeText(this, "Hello ${input.text}!", Toast.LENGTH_SHORT).show()
            }

            builder.setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }

            builder.setNeutralButton("Having fun!") { dialog, _ ->
                Toast.makeText(this, "I'm glad to know that!!!", Toast.LENGTH_SHORT).show()
            }

            val defaultDialog = builder.create()
            defaultDialog.show()

        }

    }
}