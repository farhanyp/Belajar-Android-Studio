package com.yp.myapplication

import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

//    Menggunakan lateinit bagian dari best practice untuk mendeklarasikan id
    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView

//    Mendeklarasikan fungsi initComponents untuk menampkan id
    private fun initComponents(){
        nameEditText= findViewById(R.id.nameEditText)
        sayHelloButton= findViewById(R.id.sayHelloButton)
        sayHelloTextView= findViewById(R.id.sayHelloTextView)
    }

//    Cek apakah android mempunyai fitur fingerprint
    private fun checkFeature(){
        if(packageManager.hasSystemFeature(PackageManager.FEATURE_AUTOMOTIVE)){
            Log.i("FEATURE", "Fitur Fingerprints ON")
        }else{
            Log.i("FEATURE", "Fitur Fingerprints OFF")
        }
    }

//    Cek apakah andorid memiliki SDK yang cukup
    private fun checkSDK(){
        Log.i("SDK", Build.VERSION.SDK_INT.toString())

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S){
            Log.i("FEATURE", "SDK Tidak cukup")
        }else{
            Log.i("FEATURE", "SDK cukup")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Menampilkan layout Hello_world
        setContentView(R.layout.hello_world)

//        Memanggil Function initComponents
        initComponents()

        checkFeature()
        checkSDK()

//        Menangkap id komponen
//        val nameEditText: EditText = findViewById(R.id.nameEditText)
//        val sayHelloButton: Button = findViewById(R.id.sayHelloButton)
//        val sayHelloTextView: TextView = findViewById(R.id.sayHelloTextView)

//        Menggunakan click listener pada button
        sayHelloButton.setOnClickListener{

//            Mengubah inputan text menjadi string
            val name = nameEditText.text.toString()
//            Menampilkan text ke text view
//            sayHelloTextView.text = name

//            Menampilkan text ke text view menggunakan resource string
            sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name)

//            Memanggil Resource String berbentuk Array
//            resources.getStringArray(R.array.names).forEach {
//                Log.i("YP", it)
//            }

//            Mencoba memakai resource value lainnya
//            Log.i("ValueResource", resources.getBoolean(R.bool.isTrue).toString())
//            Log.i("ValueResource", resources.getInteger(R.integer.maxPage).toString())
//            Log.i("ValueResource", resources.getIntArray(R.array.numbers).joinToString(", "))
//            Log.i("ValueResource", resources.getColor(R.color.background).toString())

//            Mencoba mengganti warna button
//            sayHelloButton.setBackgroundColor(resources.getColor((R.color.background)))

//            Menggunakan Assets Manager yaitu salah satunya ialah Json
//            val json = assets.open("sample.json").bufferedReader().use { it.readText() }
//
//            Log.i("Assets", json)





        }

    }
}