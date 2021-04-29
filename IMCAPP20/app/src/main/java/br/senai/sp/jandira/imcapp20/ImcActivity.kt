package br.senai.sp.jandira.imcapp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val btnCalcular: Button = findViewById(R.id.button_calcular_imc)
        val edPeso: EditText = findViewById(R.id.ed_peso)
        val edAltura:EditText = findViewById(R.id.ed_altura)

        btnCalcular.setOnClickListener {
            if (edPeso.text.isEmpty()){
                edPeso.error = "Este campo é obrigatório!"
            }

            if (edAltura.text.isEmpty())
            {
                edAltura.error = "Este campo é obrigatório!"
            }

            if (edPeso.text.isNotEmpty() && edAltura.text.isNotEmpty()){

                val peso:Double = edPeso.text.toString().toDouble()
                val altura:Double = edAltura.text.toString().toDouble()

                val intent = Intent(this, ResulatdoImcActivity::class.java)
                intent.putExtra("peso", peso)
                intent.putExtra("altura", altura)
                startActivity(intent)

            }

        }


    }
}