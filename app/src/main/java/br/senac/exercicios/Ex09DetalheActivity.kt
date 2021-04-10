package br.senac.exercicios

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exercicios.databinding.ActivityEx09DetalheBinding

class Ex09DetalheActivity : AppCompatActivity() {

    lateinit var binding: ActivityEx09DetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx09DetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSomar.setOnClickListener {
            val valor1 = intent.getStringExtra("valor1")?.toDouble()!!;
            val valor2 = intent.getStringExtra("valor2")?.toDouble()!!;

            val resultado = valor1.plus(valor2);

            val returnIntent = Intent()
            returnIntent.putExtra("resultado", resultado.toString())
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }

        binding.buttonDividir.setOnClickListener {
            val valor1 = intent.getStringExtra("valor1")?.toDouble()!!;
            val valor2 = intent.getStringExtra("valor2")?.toDouble()!!;

            val resultado = valor1.div(valor2);

            val returnIntent = Intent()
            returnIntent.putExtra("resultado", resultado.toString())
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }

        binding.buttonSubtrair.setOnClickListener {
            val valor1 = intent.getStringExtra("valor1")?.toDouble()!!;
            val valor2 = intent.getStringExtra("valor2")?.toDouble()!!;

            val resultado = valor1.minus(valor2);

            val returnIntent = Intent()
            returnIntent.putExtra("resultado", resultado.toString())
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }

        binding.buttonMultiplicar.setOnClickListener {
            val valor1 = intent.getStringExtra("valor1")?.toDouble()!!;
            val valor2 = intent.getStringExtra("valor2")?.toDouble()!!;

            val resultado = valor1.times(valor2);

            val returnIntent = Intent()
            returnIntent.putExtra("resultado", resultado.toString())
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }
    }
}