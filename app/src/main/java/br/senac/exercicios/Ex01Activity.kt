package br.senac.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exercicios.databinding.ActivityEx01Binding

class Ex01Activity : AppCompatActivity() {

    lateinit var binding: ActivityEx01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFinish.setOnClickListener {
            val email = binding.editTextEmail.text.toString()
            val name =  binding.editTextName.text.toString()
            val phone = binding.editTextPhone.text.toString()
            val whats = binding.editTextWhats.text.toString()

            var msg = """Nome: ${name}
            |E-mail: ${email}
            |Telefone: ${phone} 
            |WhatsApp: ${whats}
            |
            |Preferência de Contato
            |  - Telefone: ${if (binding.checkBoxPhone.isChecked) "Sim" else "Não"}
            |  - E-mail: ${if (binding.checkBoxEmail.isChecked)  "Sim" else "Não"}
            |  - App: ${if (binding.checkBoxApp.isChecked)  "Sim" else "Não"}
            |""".trimMargin()

            alert("Cadastro efetuado!", msg, this)
        }

    }
}