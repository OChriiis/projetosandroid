package br.senai.sp.jandira.imcapp20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_ncd.*

class NcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        val btnCalcular: Button = findViewById(R.id.button_calcular_ncd)
        val spinneridade: Spinner = findViewById(R.id.spinner_idade)
        val spinnerNvlAtv: Spinner = findViewById(R.id.spinner_nvl_atv)

        val radiogroup: RadioGroup = findViewById(R.id.radio_group)
        val id = radiogroup.checkedRadioButtonId;


        btnCalcular.setOnClickListener {
            if (ed_peso.text.isEmpty()) {
                ed_peso.error = "Este campo é obrigatório!"
            }
            if (id == -1){
                Toast.makeText(applicationContext, "Selecione um sexo!", Toast.LENGTH_SHORT).show();
            }
        }

    }
}