package br.senac.exercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exercicios.databinding.ActivityEx07Binding

class Ex07Activity : AppCompatActivity() {

    lateinit var binding : ActivityEx07Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx07Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonShowDetail.setOnClickListener {
            val intent = Intent(this, Ex07DetalheActivity::class.java)
            intent.putExtra("texto1", binding.editTextText1.text.toString())
            intent.putExtra("texto2", binding.editTextText2.text.toString())
            startActivity(intent)
        }

    }
}