package br.senac.exercicios

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import br.senac.exercicios.databinding.ActivityEx04Binding

class Ex04Activity : AppCompatActivity() {

    lateinit var binding : ActivityEx04Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx04Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setOptionsSpinner()
    }

    private fun setOptionsSpinner(){
        val options = arrayOf("Filme", "Música", "Livro", "Jogo")

        val adapterOptions = ArrayAdapter(this, R.layout.simple_spinner_item, options)
        adapterOptions.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerOptions.adapter = adapterOptions

        setGenreSpinner(0)

        binding.spinnerOptions.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                setGenreSpinner(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }

    private fun setGenreSpinner(type: Int){

        var genres = arrayOf("")

        when (type) {
            0 -> genres = arrayOf("Ação", "Aventura", "Biográfico", "Comédia", "Histórico")
            1 -> genres = arrayOf("Axé", "Country", "Eletrônica", "Forró", "Funk")
            2 -> genres = arrayOf("Poesia", "Romance", "Literatura de Guerra", "Paródia", "Biografia")
            3 -> genres = arrayOf("RPG", "Battle Royale", "FPS", "PvP", "MMO")
        }

        val adapterGenre = ArrayAdapter(this, R.layout.simple_spinner_item, genres)
        adapterGenre.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerGenre.adapter = adapterGenre
    }
}