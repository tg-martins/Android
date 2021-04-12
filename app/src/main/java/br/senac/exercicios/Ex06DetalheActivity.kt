package br.senac.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exercicios.databinding.ActivityEx06DetalheBinding

class Ex06DetalheActivity : AppCompatActivity() {

    lateinit var binding : ActivityEx06DetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx06DetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val img = intent.getIntExtra("img",0)
        binding.imagem.setImageResource(img)
        binding.imagem.tag = img
    }
}