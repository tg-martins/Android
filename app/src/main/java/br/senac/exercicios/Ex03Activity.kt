package br.senac.exercicios

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import br.senac.exercicios.databinding.ActivityEx03Binding

class Ex03Activity : AppCompatActivity() {

    lateinit var binding: ActivityEx03Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx03Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val emailTypes = arrayOf("Selecione", "Pessoal", "Profissional", "Outro")
        val apps = arrayOf("Selecione", "WhatsApp", "Telegram", "Signal", "Discord", "Skype")

        val adapterEmail = ArrayAdapter(this, R.layout.simple_spinner_item, emailTypes)
        adapterEmail.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerEmail.adapter = adapterEmail

        val adapterApps = ArrayAdapter(this, R.layout.simple_spinner_item, apps)
        adapterApps.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerAppMessage.adapter = adapterApps

        binding.spinnerAppMessage.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int, id: Long) {
                binding.editTextAppMessage.setText(binding.spinnerAppMessage.selectedItem.toString())
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }
}