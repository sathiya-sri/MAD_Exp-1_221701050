package com.example.exp_1



import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var myTextView: TextView
    private lateinit var changeFontButton: Button
    private lateinit var changeColorButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.myTextView)
        changeFontButton = findViewById(R.id.changeFontButton)
        changeColorButton = findViewById(R.id.changeColorButton)

        changeFontButton.setOnClickListener {
            // Change font style to bold italic
            myTextView.setTypeface(null, Typeface.BOLD_ITALIC)

            // Show a toast
            Toast.makeText(this, "Font changed!", Toast.LENGTH_SHORT).show()
        }

        changeColorButton.setOnClickListener {
            // Change text color
            myTextView.setTextColor(Color.parseColor("#FF0000")) // Indigo color

            // Show a toast
            Toast.makeText(this, "Color changed!", Toast.LENGTH_SHORT).show()
        }
    }
}

