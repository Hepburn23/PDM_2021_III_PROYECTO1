package hn.edu.ujcv.pdm_2021_iii_p1_proyecto1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_facturas_por_identidad.*


class FacturasPorIdentidadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facturas_por_identidad)
        btnAtrasFacturasIdentidad.setOnClickListener{onBackPressed()}
    }
    fun mostrarFacturaPorIdentidad(view: View){

    }
}