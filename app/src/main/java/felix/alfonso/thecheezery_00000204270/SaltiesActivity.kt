package felix.alfonso.thecheezery_00000204270

import android.os.Bundle
import felix.alfonso.thecheezery_00000204270.adapters.ProductsAdapter
import felix.alfonso.thecheezery_00000204270.dominio.Product
import kotlinx.android.synthetic.main.activity_cold_drinks.*

class SaltiesActivity : ProductLineActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salties)

        agregarProductos()

        var adapter: ProductsAdapter = ProductsAdapter(this, lstProducts)
        lvProductos.adapter = adapter
    }

    override fun agregarProductos() {
        lstProducts.add(Product("Chicken crepes", R.drawable.chickencrepes, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6.0))
        lstProducts.add(Product("Club sandwich", R.drawable.clubsandwich, "A delicious sandwich served with french fries.", 5.0))
        lstProducts.add(Product("Panini",R.drawable.hampanini, "Sandwich made with Italian bread served warmed by grilling.", 4.0))
        lstProducts.add(Product("Philly cheese steak", R.drawable.phillycheesesteak, "Smothered in grilled onions, green peppers, mushrooms, and Provolane.",6.0))
        lstProducts.add(Product("Nachos", R.drawable.nachos, "A capuccino is an espresso based coffee drink, prepared with steamed foam.",7.0))
    }
}