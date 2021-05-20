package br.senai.sp.jandira.imcapp20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoNcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ncd)

<<<<<<< HEAD
        val txtNcd: TextView = findViewById(R.id.text_view_ncd)
        val txtDica: TextView =findViewById(R.id.text_view_dica)

        val peso = intent.getDoubleExtra("peso", 0.0)
        val nivelAtividade = intent.getIntExtra("nivelAtividade", 0)
        val idade = intent.getIntExtra("faixaIdade", 0)
        val genero = intent.getCharExtra("genero", 'f')

        val ncd = calcularNdc(genero, peso, idade, nivelAtividade)

        txtNcd.text = String.format("%.1f", ncd)

        txtDica.text = getdicaDoDia()


=======
        val txtImc: TextView = findViewById(R.id.text_view_imc)
        val txtStatus: TextView = findViewById(R.id.text_view_status)
        val txtStatusRisk: TextView = findViewById(R.id.text_view_frase_status)
        val txtDica: TextView = findViewById(R.id.text_view_dica)
>>>>>>> d444078f6359640b57a71b9819dafbf7f90e4f40
    }
}