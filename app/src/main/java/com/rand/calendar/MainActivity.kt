package com.rand.calendar

import android.app.DatePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var text: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.textDate)
        button = findViewById(R.id.buttonShowDate)

        button.setOnClickListener {
            openDialog()
        }
    }

    private fun openDialog() {
        val dialogDate = DatePickerDialog(this)
        dialogDate.setButton(DialogInterface.BUTTON_POSITIVE, "React",
            DialogInterface.OnClickListener
                { dialog, which ->
                    val day = dialogDate.datePicker.dayOfMonth
                    val month = dialogDate.datePicker.month
                    val year = dialogDate.datePicker.year
                    text.text = formattedDate(day, month, year)
                }
        )
        dialogDate.show()
    }

    private fun formattedDate(day: Int, month: Int, year: Int): String {
        return "$day/${month + 1}/$year"
    }
}