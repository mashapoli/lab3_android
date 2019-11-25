package com.example.lab3_2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Third: AppCompatActivity() {

    lateinit var navView: BottomNavigationView

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {

            R.id.about -> {
                val intent=Intent(applicationContext, About::class.java)
                startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT))
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third)
        setTitle(R.string.activity_3)
        findViewById<Button>(R.id.toFirstT).setOnClickListener(this::toFirst)
        findViewById<Button>(R.id.toSecondT).setOnClickListener(this::toSecond)
        navView = findViewById(R.id.bottom_navigation)
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private fun toFirst(view: View){
        Intent(this, First::class.java)
        setResult(Activity.RESULT_OK)
        finish()
    }

    private fun toSecond(view: View){
        finish()
    }
}