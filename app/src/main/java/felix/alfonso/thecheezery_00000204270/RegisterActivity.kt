package felix.alfonso.thecheezery_00000204270

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnSignIn.setOnClickListener {
            val intent: Intent=Intent(this, ColdDrinksActivity::class.java)
            startActivity(intent)
        }
    }
}