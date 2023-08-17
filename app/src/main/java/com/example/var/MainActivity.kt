package com.example.`var`

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.`var`.BuildConfig


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val helloTextView = findViewById<TextView>(R.id.hello)

        if (BuildConfig.DEBUG) {
            helloTextView.visibility = View.VISIBLE
        } else {
            helloTextView.visibility = View.GONE
        }

    }
}