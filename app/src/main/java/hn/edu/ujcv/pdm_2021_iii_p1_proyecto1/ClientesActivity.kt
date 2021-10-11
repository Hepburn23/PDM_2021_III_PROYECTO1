package hn.edu.ujcv.pdm_2021_iii_p1_proyecto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_clientes.*

class ClientesActivity : AppCompatActivity() {
    var clientes: HashMap<Int, String> = hashMapOf()
    var numero = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clientes)
        btnGuardarCliente.setOnClickListener {
            save()
        }
    }

    fun save() {
        val info = StringBuilder()
        numero += 1
        info.append(txtId.text.toString()).append("")
        info.append(txtClientName.text.toString().trim()).append("")
        info.append(txtBirthDate.text.toString()).append("")
        info.append(txtDateOfAdmission.text.toString()).append("")
        info.append(txtEmail.text.toString())
        clientes.put(numero, info.toString())

        sincampos()

        if (sincampos() == true) {
            btnGuardarCliente.isEnabled = true
            Toast.makeText(this, "guardado", Toast.LENGTH_SHORT).show()

            cleanClients()
        }
    }

    fun sincampos(): Boolean {
        if (txtId.text.toString().isEmpty()) {
            txtId.error = "Campo Requerido"
            return false

        } else if (txtClientName.text.toString().isEmpty()) {
            txtClientName.error = "Campo Requerido"
            return false

        }
        if (txtBirthDate.text.toString().isEmpty()) {
            txtBirthDate.error = "Campo Requerido"
            return false

        }
        if (txtDateOfAdmission.text.toString().isEmpty()) {
            txtDateOfAdmission.error = "Campo Requerido"
            return false

        }
        if (txtEmail.text.toString().isEmpty()) {
            txtEmail.error = "Campo Requerido"
            return false

        }
        return true
    }

    fun visualizar() {
        val intent = Intent(this, ClientesPorIdentidadActivity::class.java)
        intent.putExtra("clientes", clientes)
        startActivity(intent)
        //debe traer otra funcion o esquema
    }

    fun cleanClients(){
        txtId.setText("")
        txtClientName.setText("")
        txtBirthDate.setText("")
        txtDateOfAdmission.setText("")
        txtEmail.setText("")
    }
}