// ודא שזה תואם ל-AndroidManifest.xml

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Main : AppCompatActivity() {

    private var isFirstImage = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)  // החלף ל- main או לשם הקובץ שלך

        val buttonGreet = findViewById<Button>(R.id.buttonGreet)
        val imageView = findViewById<ImageView>(R.id.imageViewDisplay)
        val imageButtonSwap = findViewById<ImageButton>(R.id.imageButtonSwap)
        val editTextName = findViewById<EditText>(R.id.editTextName)

        buttonGreet.setOnClickListener {
            val name = editTextName.text.toString()
            val message = if (name.isNotEmpty()) "שלום, $name!" else "שלום, יוסי!"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        imageButtonSwap.setOnClickListener {
            if (isFirstImage) {
                imageView.setImageResource(R.drawable.image2)
            } else {
                imageView.setImageResource(R.drawable.image1)
            }
            isFirstImage = !isFirstImage
        }
    }
}
