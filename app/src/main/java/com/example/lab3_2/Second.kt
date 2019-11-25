package com.example.lab3_2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Second: AppCompatActivity() {
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
        setContentView(R.layout.second)
        setTitle(R.string.activity_2)
        findViewById<Button>(R.id.toFirstS).setOnClickListener(this::toFirst)
        findViewById<Button>(R.id.toThirdS).setOnClickListener(this::toThird)
        navView = findViewById(R.id.bottom_navigation)
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private fun toFirst(view: View){
        finish()
    }
    private fun toThird(view: View){
        val intent=Intent(this, Third::class.java)
        startActivityForResult(intent,1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1 && resultCode == Activity.RESULT_OK)
                this.finish()
    }


}