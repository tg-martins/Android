package br.senac.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import br.senac.exercicios.databinding.ActivityEx02Binding

class Ex02Activity : AppCompatActivity() {
    lateinit var binding: ActivityEx02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editTextEmail2.isEnabled = binding.checkBoxEmail2.isChecked
        binding.editTextPhone2.isEnabled = binding.checkBoxPhone2.isChecked
        binding.editTextWhats2.isEnabled = binding.checkBoxApp2.isChecked

        binding.checkBoxEmail2.setOnCheckedChangeListener{ button: CompoundButton, checked: Boolean ->
            binding.editTextEmail2.isEnabled = checked
        }

        binding.checkBoxPhone2.setOnCheckedChangeListener{ button: CompoundButton, checked: Boolean ->
            binding.editTextPhone2.isEnabled = checked
        }

        binding.checkBoxApp2.setOnCheckedChangeListener{ button: CompoundButton, checked: Boolean ->
            binding.editTextWhats2.isEnabled = checked
        }

        binding.buttonFinish2.setOnClickListener {
            val email = binding.editTextEmail2.text.toString()
            val name =  binding.editTextName2.text.toString()
            val phone = binding.editTextPhone2.text.toString()
            val whats = binding.editTextWhats2.text.toString()

            var isValidForm = true

            if (binding.checkBoxEmail2.isChecked && email.trim().isNullOrEmpty()) {
                isValidForm = false
                binding.editTextEmail2.setError("E-mail não pode estar vazio");
            }
            if (binding.checkBoxApp2.isChecked && whats.trim().isNullOrEmpty()) {
                isValidForm = false
                binding.editTextWhats2.setError("WhatsApp não pode estar vazio");
            }
            if (binding.checkBoxPhone2.isChecked && phone.trim().isNullOrEmpty()) {
                isValidForm = false
                binding.editTextPhone2.setError("Telefone não pode estar vazio");
            }

            if(isValidForm) {
                var msg = """Nome: ${name}
                |E-mail: ${email}
                |Telefone: ${phone} 
                |WhatsApp: ${whats}
                |
                |Preferência de Contato
                |  - Telefone: ${if (binding.checkBoxPhone2.isChecked) "Sim" else "Não"}
                |  - E-mail: ${if (binding.checkBoxEmail2.isChecked)  "Sim" else "Não"}
                |  - App: ${if (binding.checkBoxApp2.isChecked)  "Sim" else "Não"}
                |""".trimMargin()

                alert("Cadastro efetuado!", msg, this)
            }
        }

    }
}