package com.example.funwithfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val manager = supportFragmentManager

        supportFragmentManager.beginTransaction().add(R.id.container, ColorSelectionFragment()).commit()


    }




}