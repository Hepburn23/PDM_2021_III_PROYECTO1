package hn.edu.ujcv.pdm_2021_iii_p1_proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_clientes.*
import kotlinx.android.synthetic.main.activity_facturas_de_ventas.*

class FacturasDeVentasActivity : AppCompatActivity() {
    var facturasV: HashMap<Int, String> = hashMapOf()
    var numero = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facturas_de_ventas)
        btnInvoiceSave.setOnClickListener{
            save()
        }}

        fun save() {
            val info = StringBuilder()
            numero+=1
            info.append(txtInvoiceId.text.toString()).append("")
            info.append(txtInvoiceDate.text.toString()).append("")
            info.append(txtClientId.text.toString().trim()).append("")
            info.append(txtProductCode.text.toString()).append("")
            info.append(txtLedQuantity.text.toString())
            info.append(txtSubTotal.text.toString())
            facturasV.put(numero, info.toString())

            campovacio()

            if (campovacio()== true){
                btnInvoiceSave.isEnabled = true
                Toast.makeText(this,"guardado", Toast.LENGTH_SHORT).show()

            }
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
            if (txtSubTotal.text.toString().isEmpty()){
                txtEmail.error ="Campo Requerido"
                return false

            }
            return true
    }


}


