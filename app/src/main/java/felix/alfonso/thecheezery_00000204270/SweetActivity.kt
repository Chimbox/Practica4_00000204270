package felix.alfonso.thecheezery_00000204270

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import felix.alfonso.thecheezery_00000204270.adapters.ProductsAdapter
import felix.alfonso.thecheezery_00000204270.dominio.Product
import kotlinx.android.synthetic.main.activity_cold_drinks.*

class SweetActivity : ProductLineActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sweet)

        agregarProductos()

        var adapter: ProductsAdapter = ProductsAdapter(this, lstProducts)
        lvProductos.adapter = adapter
    }

    override fun agregarProductos() {
        lstProducts.add(Product("Blueberry cake", R.drawable.blueberrycake, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6.0))
        lstProducts.add(Product("Chocolate cupcake", R.drawable.chocolatecupcake, "Chocolate cupcakes topped with butter cream and cherries.", 3.0))
        lstProducts.add(Product("Lemon tartalette",R.drawable.lemontartalette, "Pastry shell with a lemon flavored filling.", 4.0))
        lstProducts.add(Product("Red velvet cake", R.drawable.redvelvetcake, "Soft, moist, buttery, cake topped with an easy cream cheese frosting.",6.0))
        lstProducts.add(Product("Cherry cheesecake", R.drawable.strawberrycheesecake, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.",7.0))
        lstProducts.add(Product("Tiramisu", R.drawable.tiramisu, "Coffe-flavored Italian dessert.", 6.0))
    }
}