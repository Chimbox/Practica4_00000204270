package felix.alfonso.thecheezery_00000204270

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import felix.alfonso.thecheezery_00000204270.dominio.Product

open abstract class ProductLineActivity : AppCompatActivity() {
    protected var lstProducts = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    protected abstract fun agregarProductos()
}