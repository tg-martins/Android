package br.senac.exercicios

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exercicios.databinding.ActivityEx08Binding

class Ex08Activity : AppCompatActivity() {

    lateinit var binding : ActivityEx08Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx08Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOpenUrl.setOnClickListener {
            try {
                val url = Uri.parse(binding.editTextUrl.text.toString())
                val intent = Intent(Intent.ACTION_VIEW, url)
                startActivity(intent)
            }catch (ex : Exception){
                alert("Erro!", "URL Inválida", this)
            }
        }
    }
}