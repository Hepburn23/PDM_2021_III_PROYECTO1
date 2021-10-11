package hn.edu.ujcv.pdm_2021_iii_p1_proyecto1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_clientes.*
import kotlinx.android.synthetic.main.activity_facturas_de_ventas.*
import kotlinx.android.synthetic.main.activity_productos.*

class FacturasDeVentasActivity : AppCompatActivity() {
    var facturasV: HashMap<Int, String> = hashMapOf()
    var numero = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facturas_de_ventas)
        btnInvoiceSave.setOnClickListener{
            save()
            multi()
        }
        btnInvoiceVisualize.setOnClickListener {
            enviar()
        }
    }

        fun save() {
            val info = StringBuilder()
            numero+=1
            info.append(txtInvoiceId.text.toString()).append("")
            info.append(txtInvoiceDate.text.toString()).append("")
            info.append(txtClientId.text.toString().trim()).append("")
            info.append(txtProductCode.text.toString()).append("")
            info.append(txtLedQuantity.text.toString())
            facturasV.put(numero, info.toString())

            campovacio()

            if (campovacio()== true){
                btnInvoiceSave.isEnabled = true
                Toast.makeText(this,"guardado", Toast.LENGTH_SHORT).show()


            }
        }
    private fun enviar() {
        val intent = Intent(this, FacturasPorIdentidadActivity::class.java)
        intent.putExtra("facturasV", facturasV)
        startActivity(intent)
    }
        fun campovacio() : Boolean {
            if (txtInvoiceId.text.toString().isEmpty()){
                txtInvoiceId.error ="Campo Requerido"
                return false

            }else if (txtClientId.text.toString().isEmpty()){
                txtClientName.error = "Campo Requerido"
                return false

            }
            if (txtInvoiceDate.toString().isEmpty()){
                txtBirthDate.error ="Campo Requerido"
                return false

            }
            if (txtProductCode.text.toString().isEmpty()){
                txtDateOfAdmission.error ="Campo Requerido"
                return false

            }
            if (txtLedQuantity.text.toString().isEmpty()){
                txtEmail.error ="Campo Requerido"
                return false

            }
            return true
    }
    fun multi(){
        var Total= 1000 //(txtPrice*txtLedQuantity)
        var precioCosas = txtPrice
        txvSubTotal2.text= "Su subtotal es de: $Total"
    }

}









