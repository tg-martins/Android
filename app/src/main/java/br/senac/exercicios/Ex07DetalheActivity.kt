package br.senac.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class Ex07DetalheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex07_detalhe)

        val text1 = intent.getStringExtra("texto1")
        val text2 = intent.getStringExtra("texto2")

         AlertDialog.Builder(this)
            .setTitle("Mensagem exercicio 7")
            .setMessage(text1.plus(text2))
            .setPositiveButton("OK") { dialog, which -> finish()}
            .create()
            .show()
    }
}