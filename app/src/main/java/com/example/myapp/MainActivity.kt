package com.example.myapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var buttonGreet: Button
    private lateinit var imageView: ImageView
    private lateinit var textViewInteresting: TextView
    private lateinit var imageButtonSwitch: ImageButton

    private var isImage1 = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        editTextName = findViewById(R.id.editTextName)
        buttonGreet = findViewById(R.id.buttonGreet)
        imageView = findViewById(R.id.imageView)
        textViewInteresting = findViewById(R.id.textViewInteresting)
        imageButtonSwitch = findViewById(R.id.imageButtonSwitch)

        buttonGreet.setOnClickListener {
            val name = editTextName.text.toString()
            if (name.isNotBlank()) {
                Toast.makeText(this, "שלום, $name!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "אנא הזן שם קודם.", Toast.LENGTH_SHORT).show()
            }
        }

        imageButtonSwitch.setOnClickListener {
            if (isImage1) {
                imageView.setImageResource(R.drawable.image2)
            } else {
                imageView.setImageResource(R.drawable.image1)
            }
            isImage1 = !isImage1
        }
    }
}

