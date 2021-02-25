package felix.alfonso.thecheezery_00000204270

import android.os.Bundle
import felix.alfonso.thecheezery_00000204270.adapters.ProductsAdapter
import felix.alfonso.thecheezery_00000204270.dominio.Product
import kotlinx.android.synthetic.main.activity_products.*

class SaltiesActivity : ProductLineActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ivLineaProducto.setImageResource(R.drawable.salties)
    }

    override fun agregarProductos() {
        lstProducts.add(Product("Chicken crepes", R.drawable.chickencrepes, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6))
        lstProducts.add(Product("Club Sandwich", R.drawable.clubsandwich, "A delicious sandwich served with french fries.", 5))
        lstProducts.add(Product("Panini", R.drawable.hampanini, "Sandwich made with Italian bread  served warmed by grilling.", 4))
        lstProducts.add(Product("Philly cheese steak", R.drawable. phillycheesesteak, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6))
        lstProducts.add(Product("Nachos", R.drawable. nachos, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7))
    }
}