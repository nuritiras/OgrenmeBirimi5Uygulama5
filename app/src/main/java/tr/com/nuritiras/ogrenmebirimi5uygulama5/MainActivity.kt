package tr.com.nuritiras.ogrenmebirimi5uygulama5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTextText = findViewById<EditText>(R.id.editTextText)
        val editTextText2 = findViewById<EditText>(R.id.editTextText2)
        val editTextText3 = findViewById<EditText>(R.id.editTextText3)
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val cihazAdi = editTextText.text.toString()
            val cihazKW = editTextText2.text.toString().toInt()
            val gunlukSaatKullanim = editTextText3.text.toString().toInt()
            val cihaz1 = ElektrikliCihaz()
            cihaz1.cihazAdi = cihazAdi
            cihaz1.cihazKW = cihazKW
            cihaz1.gunlukSaatKullanim = gunlukSaatKullanim
            val aylikTuketim = cihaz1.aylikTuketim()
            textView.text = "Sonuç: $aylikTuketim KW"
        }

    }
}