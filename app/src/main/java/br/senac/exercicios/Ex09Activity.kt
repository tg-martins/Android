package br.senac.exercicios

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exercicios.databinding.ActivityEx09Binding

class Ex09Activity : AppCompatActivity() {

    lateinit var binding: ActivityEx09Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx09Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener {
            var isValidNumbers = true;

            if (binding.editTextTextValor1.text.trim().isNullOrEmpty()) {
                isValidNumbers = false
                binding.editTextTextValor1.setError("Valor 1 não pode estar vazio");
            }

            if (binding.editTextTextValor2.text.trim().isNullOrEmpty()) {
                isValidNumbers = false
                binding.editTextTextValor2.setError("Valor 2 não pode estar vazio");
            }

            if(isValidNumbers){
                val intent = Intent(this, Ex09DetalheActivity::class.java)
                intent.putExtra("valor1", binding.editTextTextValor1.text.toString())
                intent.putExtra("valor2", binding.editTextTextValor2.text.toString())

                startActivityForResult(intent, 1)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                val resultado = data?.getStringExtra("resultado");
                binding.editTextTextResultado.setText(resultado)
            }
        }
    }
}