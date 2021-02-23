package felix.alfonso.thecheezery_00000204270

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import felix.alfonso.thecheezery_00000204270.adapters.ProductsAdapter
import felix.alfonso.thecheezery_00000204270.dominio.Product
import kotlinx.android.synthetic.main.activity_cold_drinks.*

class HotDrinksActivity : ProductLineActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hot_drinks)

        agregarProductos()

        var adapter: ProductsAdapter = ProductsAdapter(this, lstProducts)
        lvProductos.adapter = adapter
    }

    override fun agregarProductos() {
        lstProducts.add(Product("Latte", R.drawable.latte, "Coffee drink made with espresso and steamed milk.", 6.0))
        lstProducts.add(Product("Hot chocolate", R.drawable.hotchocolate, "Heated drink consisting of shaved chocolate, topped with marshmallows.", 5.0))
        lstProducts.add(Product("Espresso",R.drawable.espresso, "Full-flavored, concentrated form of coffee.", 4.0))
        lstProducts.add(Product("Chai latte", R.drawable.chailatte, "Spiced tea concentrate with milk.",6.0))
        lstProducts.add(Product("Capuccino", R.drawable.capuccino, "A capuccino is an espresso based coffee drink, prepared with steamed foam.",7.0))
        lstProducts.add(Product("American coffee", R.drawable.americano, "Espresso with hot water.", 2.0))
    }
}