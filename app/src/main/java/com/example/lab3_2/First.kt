package com.example.lab3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView


class First : AppCompatActivity() {

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
        setContentView(R.layout.first)
        setTitle(R.string.activity_1)
        findViewById<Button>(R.id.toSecondF).setOnClickListener(this::toSecond)
        findViewById<Button>(R.id.toSecondNoAnimF).setOnClickListener(this::toSecondNoAnimation)

        navView = findViewById(R.id.bottom_navigation)
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
}
    fun toSecond(view: View){
        val intent=Intent(this, Second::class.java)
        startActivity(intent)
    }

    fun toSecondNoAnimation(view: View){
        val intent = Intent(this, Second::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        startActivity(intent)
    }

}

