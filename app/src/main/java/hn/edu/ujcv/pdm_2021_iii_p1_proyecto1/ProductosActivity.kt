package hn.edu.ujcv.pdm_2021_iii_p1_proyecto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_productos.*
import java.lang.StringBuilder

class ProductosActivity : AppCompatActivity() {
    var valoresProducto: HashMap<Int, String> = hashMapOf()
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        //Handler
        btnSave.setOnClickListener {
            emptyAlert()
            if (txtCode.text.isNotEmpty() and txtName.text.isNotEmpty() and txtProvider.text.isNotEmpty() and txtPrice.text.isNotEmpty() and txtStock.text.isNotEmpty()) {
                saveProd()
            }
        }
    }



    fun saveProd(){
        val datosProducto = StringBuilder()
        number+=1
        datosProducto.append(txtCode.text.toString().trim()).append("|")
        datosProducto.append(txtName.text.toString().trim()).append("|")
        datosProducto.append(txtProvider.text.toString().trim()).append("|")
        datosProducto.append(txtPrice.text.toString().trim()).append("|")
        datosProducto.append(txtStock.text.toString().trim()).append("|")

        valoresProducto.put(number,datosProducto.toString())

        Toast.makeText(this,"Datos del Producto Ingresados Correctamente", Toast.LENGTH_SHORT).show()

        /*val codeP = txtCode.text.toString()
        val nameP = txtName.text.toString()
        val providerP = txtProvider.text.toString()
        val priceP = txtPrice.text.toString()
        val stockP = txtStock.text.toString()

        val intent = Intent(this@ProductosActivity, ProductoPorCodigoActivity::class.java)
        intent.putExtra("Code", codeP)
        intent.putExtra("Name", nameP)
        intent.putExtra("Provider", providerP)
        intent.putExtra("Price", priceP)
        intent.putExtra("Stock", stockP)

        startActivity(intent)*/

        txtCode.setText("")
        txtName.setText("")
        txtProvider.setText("")
        txtPrice.setText("")
        txtStock.setText("")

    }

    fun  emptyAlert(){
        when{
            txtCode.text.isEmpty()      -> Toast.makeText(this,"Es Obligatorio Ingresar Codigo del Producto", Toast.LENGTH_SHORT).show()
            txtName.text.isEmpty()      -> Toast.makeText(this,"Es Obligatorio Ingresar Nombre del Producto", Toast.LENGTH_SHORT).show()
            txtProvider.text.isEmpty()  -> Toast.makeText(this,"Es Obligatorio Ingresar Proveedor del Producto", Toast.LENGTH_SHORT).show()
            txtPrice.text.isEmpty()     -> Toast.makeText(this,"Es Obligatorio Ingresar Precio del Producto", Toast.LENGTH_SHORT).show()
            txtStock.text.isEmpty()     -> Toast.makeText(this,"Es Obligatorio Ingresar Stock del Producto", Toast.LENGTH_SHORT).show()

            else -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}