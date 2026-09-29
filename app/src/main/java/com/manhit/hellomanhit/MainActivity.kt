package com.manhit.hellomanhit

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(48, 48, 48, 48)
        }

        val title = TextView(this).apply {
            text = "MY FIRST ANDROID APP"
            textSize = 26f
            gravity = Gravity.CENTER
        }

        val message = TextView(this).apply {
            text = "Hello Manhit!"
            textSize = 22f
            gravity = Gravity.CENTER
            setPadding(0, 40, 0, 40)
        }

        val button = Button(this).apply {
            text = "PRESS ME"

            setOnClickListener {
                message.text = "Hello, Manhit! 👋"
            }
        }

        layout.addView(title)
        layout.addView(message)
        layout.addView(button)

        setContentView(layout)
    }
}
