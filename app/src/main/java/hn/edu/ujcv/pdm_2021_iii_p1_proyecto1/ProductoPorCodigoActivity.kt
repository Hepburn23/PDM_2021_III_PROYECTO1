package hn.edu.ujcv.pdm_2021_iii_p1_proyecto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_producto_por_codigo.*

class ProductoPorCodigoActivity : AppCompatActivity() {
    var valoresProducto: HashMap<Int, String> = hashMapOf()
    //var productPerCode: HashMap<Int, String> = hashMapOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto_por_codigo)
        begining()

        btnSearchProdPerCode.setOnClickListener {
            searchProduct()
        }
    }
    private fun begining(){
        var intent = intent
        valoresProducto = intent.getSerializableExtra("producto") as HashMap<Int, String>
    }

    /*private fun sendproducts(){
        val intent = Intent(this, ProductoPorCodigoActivity::class.java)
        intent.putExtra("productos", productPerCode)
    }*/

    private fun searchProduct(){

        var code:String
        var name:String
        var provider:String
        var price:String
        var stock:String



        for(valor in valoresProducto){
            val list = valor.toString().split("|", "=")

            code     = list[1]
            name     = list[2]
            provider = list[3]
            price    = list[4]
            stock    = list[5]

            if (txtSearchProdPerCode.text.toString().equals(code)){
                txtShowCode.setText(code)
                txtShowName.setText(name)
                txtShowProvider.setText(provider)
                txtShowPrice.setText(price)
                txtShowStock.setText(stock)

                 return


            }
        }
        Toast.makeText(this, "No se Encuentra el Codigo Ingresado", Toast.LENGTH_SHORT).show()
    }

}