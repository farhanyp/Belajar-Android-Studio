package com.yp.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Menampilkan layout Hello_world
        setContentView(R.layout.hello_world)

//        Menangkap id komponen
        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val sayHelloButton: Button = findViewById(R.id.sayHelloButton)
        val sayHelloTextView: TextView = findViewById(R.id.sayHelloTextView)

//        Menggunakan click listener pada button
        sayHelloButton.setOnClickListener{
//            Mengubah inputan text menjadi string
            val name = nameEditText.text.toString()
//            Menampilkan text ke text view
            sayHelloTextView.text = name
        }

    }
}