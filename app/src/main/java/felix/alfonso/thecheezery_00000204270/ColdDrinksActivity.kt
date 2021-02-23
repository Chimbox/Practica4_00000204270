package felix.alfonso.thecheezery_00000204270

import android.os.Bundle
import felix.alfonso.thecheezery_00000204270.adapters.ProductsAdapter
import felix.alfonso.thecheezery_00000204270.dominio.Product
import kotlinx.android.synthetic.main.activity_cold_drinks.*

class ColdDrinksActivity : ProductLineActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cold_drinks)

        agregarProductos()

        var adapter: ProductsAdapter = ProductsAdapter(this, lstProducts)
        lvProductos.adapter = adapter
    }

    override fun agregarProductos() {
        lstProducts.add(Product("Caramel Frap", R.drawable.caramelfrap, "Caramel syrup meets coffee, milk and ice and whipped cream and buttery caramel sauce layer the love on top.", 5.0))
        lstProducts.add(Product("Chocolate Frap", R.drawable.chocolatefrap, "Rich mocha-flavored sauce meets up with chocolaty chips, milk and ice for a blender bash.", 6.0))
        lstProducts.add(Product("Cold Brew",R.drawable.coldbrew, "Is created by steeping medium-to-coarse ground coffee in room temperature water for 12 hours or longer.", 3.0))
        lstProducts.add(Product("Matcha Latte", R.drawable.matcha, "Leafy taste of matcha green tea powder with creamy milk and a little sugar for a flavor balance that will leave you feeling ready and raring to go.",4.0))
        lstProducts.add(Product("Oreo Milkshake", R.drawable.oreomilkshake, "Chocolate ice cream, and oreo cookies. Topped with whipped cream with cocoa and chocolate syrup.",7.0))
        lstProducts.add(Product("Peanut milkshake", R.drawable.peanutmilkshake, "Vanilla icea cream, mixed with peanut butter and chocolate", 7.0))
    }
}