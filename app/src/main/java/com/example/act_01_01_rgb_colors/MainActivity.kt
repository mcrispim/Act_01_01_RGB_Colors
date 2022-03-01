package com.example.act_01_01_rgb_colors

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            val redText = findViewById<TextView>(R.id.redChannel).text.toString()
            val greenText = findViewById<TextView>(R.id.greenChannel).text.toString()
            val blueText = findViewById<TextView>(R.id.blueChannel).text.toString()
            if (redText.isEmpty() || greenText.isEmpty() || blueText.isEmpty()) {
                Toast.makeText(this, getString(R.string.fillValues), Toast.LENGTH_LONG).apply {
                    setGravity(Gravity.CENTER, 0, 0)
                    show()
                }
            } else {
                val color = findViewById<View>(R.id.color)
                color.setBackgroundColor(Color.parseColor("#FF$redText$greenText$blueText"))
            }
        }
    }
}