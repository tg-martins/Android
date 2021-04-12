package br.senac.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import br.senac.exercicios.databinding.ActivityEx06Binding

class Ex06Activity : AppCompatActivity() {

    lateinit var binding : ActivityEx06Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx06Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.img.setOnClickListener{
            showImage(R.drawable.dog2)
        }
        binding.img2.setOnClickListener{
            showImage(R.drawable.dog01)
        }
        binding.img3.setOnClickListener{
            showImage(R.drawable.dog4)
        }
        binding.img4.setOnClickListener{
            showImage(R.drawable.dog3)
        }
        binding.img5.setOnClickListener{
            showImage(R.drawable.dog6)
        }
        binding.img6.setOnClickListener{
            showImage(R.drawable.dog5)
        }
    }

    fun showImage(id: Int){
        var intent = Intent(this, Ex06DetalheActivity::class.java)
        intent.putExtra("img",id)
        startActivity(intent)
    }
}