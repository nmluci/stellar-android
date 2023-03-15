package com.stellar.hellofuyuna

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentID: EditText = findViewById(R.id.et_student_id) as EditText
        val studentName: EditText = findViewById(R.id.et_student_name) as EditText
        val studentAddr: EditText = findViewById(R.id.et_student_addr) as EditText
        val clearBtn: Button = findViewById(R.id.bt_clear) as Button

        clearBtn.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "ID: ${studentID.text.toString()} | Name: ${studentName.text.toString()}",
                Toast.LENGTH_SHORT
            ).show()
            studentID.setText("")
            studentName.setText("")
            studentAddr.setText("")
        }
    }
}