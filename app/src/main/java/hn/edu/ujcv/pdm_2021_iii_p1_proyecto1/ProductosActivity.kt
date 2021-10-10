package hn.edu.ujcv.pdm_2021_iii_p1_proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_productos.*

class ProductosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)


        //Handler
        btnSave.setOnClickListener {
            saveProd()
        }

    }



    fun saveProd(){

    }
}