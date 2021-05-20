package br.senai.sp.jandira.imcapp20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_ncd.*

class NcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        val btnCalcular: Button = findViewById(R.id.button_calcular_ncd)
        val spinnerIdade: Spinner = findViewById(R.id.spinner_idade)
        val spinnerNvlAtv: Spinner = findViewById(R.id.spinner_nvl_atv)
        val radiogroup: RadioGroup = findViewById(R.id.radio_group)

        val itemSelecionado = radiogroup.checkedRadioButtonId
        val spinnerSelecionadoNvlAtv = spinnerNvlAtv.selectedItemPosition
        val spinnerSelecionadoIdade = spinnerIdade.selectedItemPosition

        btnCalcular.setOnClickListener {
            if (ed_peso.text.isEmpty()) {
                ed_peso.error = "Este campo é obrigatório!"
            }
            if (itemSelecionado == -1){
                Toast.makeText(this, "Selecione um sexo!", Toast.LENGTH_SHORT).show()
            }
            if (spinnerSelecionadoNvlAtv == 0){
                Toast.makeText(this, "Selecione um nivel de atividade!", Toast.LENGTH_SHORT).show()
            }
            if (spinnerSelecionadoIdade == 0){
                Toast.makeText(this, "Selecione uma faixa de idade!", Toast.LENGTH_SHORT).show()
            }
            if (ed_peso.text.isNotEmpty()) {

                val peso: Double = ed_peso.text.toString().toDouble()

            }
        }

    }
}