package com.example.lab3_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class About:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)
        setTitle(R.string.about)
    }
}