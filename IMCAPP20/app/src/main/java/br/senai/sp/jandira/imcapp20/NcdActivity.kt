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
        val rbFeminino: RadioButton = findViewById(R.id.)

        val itemSelecionado = radiogroup.checkedRadioButtonId

        val spinnerSlcIdade = spinnerIdade.selectedItem.toString()
        val spinnerSlcNvlAtv = spinnerNvlAtv.selectedItem.toString()
        val spinnerSelecionadoNvlAtv = spinnerNvlAtv.selectedItemPosition
        val spinnerSelecionadoIdade = spinnerIdade.selectedItemPosition

        btnCalcular.setOnClickListener {
            if (ed_peso.text.isEmpty()) {
                ed_peso.error = "Este campo é obrigatório!"
            }
            if (radioFeminino.isChecked()){
                val genero = 'f'
                intent.putExtra("genero", genero)
            }else{
                val genero = 'm'
                intent.putExtra("genero", genero)
            }
            intent.putExtra("peso", peso)
            intent.putExtra("nivelAtividade", nivelAtividade)
            intent.putExtra("faixaIdade", faixaEtaria)
            startActivity(intent)

            }
        }

    }
}