package felix.alfonso.thecheezery_00000204270

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import felix.alfonso.thecheezery_00000204270.adapters.ProductsAdapter
import felix.alfonso.thecheezery_00000204270.dominio.Product
import kotlinx.android.synthetic.main.activity_products.*

abstract class ProductLineActivity : AppCompatActivity() {
    protected var lstProducts = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        var adapter: ProductsAdapter = ProductsAdapter(this, lstProducts)
        lvProductos.adapter = adapter

        agregarProductos()
    }

    protected abstract fun agregarProductos()
}