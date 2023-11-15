package com.rand.calendar

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var text: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.showText)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            openDialog()
        }
    }

    private fun openDialog() {
        val dialog = DatePickerDialog(this)
        dialog.show()
    }
}