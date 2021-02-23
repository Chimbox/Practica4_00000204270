package felix.alfonso.thecheezery_00000204270.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import felix.alfonso.thecheezery_00000204270.R
import felix.alfonso.thecheezery_00000204270.dominio.Product
import kotlinx.android.synthetic.main.producto_item.view.*

public class ProductsAdapter : BaseAdapter {
    var products = ArrayList<Product>()
    var context: Context? = null

    constructor(context: Context, products: ArrayList<Product>) {
        this.context = context
        this.products = products
    }

    override fun getCount(): Int {
        return products.size
    }

    override fun getItem(p0: Int): Any {
        return products[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var prod = products[p0]
        var inflater = LayoutInflater.from(context)
        var vista = inflater.inflate(R.layout.producto_item, null)

        vista.imgProducto.setImageResource(prod.image)
        vista.tvNombreProducto.setText(prod.name)
        vista.tvDescripcionProducto.setText(prod.description)
        vista.tvPrecio.setText("$"+prod.price.toInt().toString())

        return vista
    }
}