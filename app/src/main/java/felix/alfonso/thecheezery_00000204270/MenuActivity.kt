package felix.alfonso.thecheezery_00000204270

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_menu)

        btnColdDrinks.setOnClickListener {
            val intent =Intent(this, ColdDrinksActivity::class.java)
            startActivity(intent)
        }

        btnHotDrinks.setOnClickListener {
            val intent =Intent(this, HotDrinksActivity::class.java)
            startActivity(intent)
        }

        btnSweets.setOnClickListener {
            val intent =Intent(this, SweetActivity::class.java)
            startActivity(intent)
        }

        btnSalties.setOnClickListener {
            val intent = Intent(this, SaltiesActivity::class.java)
            startActivity(intent)
        }
    }
}