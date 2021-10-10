package hn.edu.ujcv.pdm_2021_iii_p1_proyecto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_producto_por_codigo.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Handlers
        btnProducts.setOnClickListener {
            productActivity()
        }

        btnClients.setOnClickListener {
            clientActivity()
        }

        btnProdPerCode.setOnClickListener {
            prodPerCodeActivity()
        }


    }

    //FUNCIONES

    fun productActivity(){
        val intent = Intent(this,ProductosActivity::class.java)
        startActivity(intent)
    }

    fun clientActivity(){
        val intent = Intent(this,ClientesActivity::class.java)
        startActivity(intent)
    }

    fun prodPerCodeActivity(){
        val intent = Intent(this,ProductoPorCodigoActivity::class.java)
        startActivity(intent)
    }


}