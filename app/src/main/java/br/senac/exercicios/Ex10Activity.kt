package br.senac.exercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.util.ObjectsCompat
import androidx.fragment.app.FragmentActivity
import java.util.*

class Ex10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex10)

        val btnEx01 = findViewById<Button>(R.id.btnEx01)
        btnEx01.setOnClickListener{
            val intent = Intent(this, Ex01Activity::class.java)

            startActivity(intent)
        }

        val btnEx02 = findViewById<Button>(R.id.btnEx02)
        btnEx02.setOnClickListener{
            val intent = Intent(this, Ex02Activity::class.java)

            startActivity(intent)
        }

        val btnEx03 = findViewById<Button>(R.id.btnEx03)
        btnEx03.setOnClickListener{
            val intent = Intent(this, Ex03Activity::class.java)

            startActivity(intent)
        }

        val btnEx04 = findViewById<Button>(R.id.btnEx04)
        btnEx04.setOnClickListener{
            val intent = Intent(this, Ex04Activity::class.java)

            startActivity(intent)
        }

        val btnEx05 = findViewById<Button>(R.id.btnEx05)
        btnEx05.setOnClickListener{
            val intent = Intent(this, Ex05Activity::class.java)

            startActivity(intent)
        }

        val btnEx06 = findViewById<Button>(R.id.btnEx06)
        btnEx06.setOnClickListener{
            val intent = Intent(this, Ex06Activity::class.java)

            startActivity(intent)
        }

        val btnEx07 = findViewById<Button>(R.id.btnEx07)
        btnEx07.setOnClickListener{
            val intent = Intent(this, Ex07Activity::class.java)

            startActivity(intent)
        }

        val btnEx08 = findViewById<Button>(R.id.btnEx08)
        btnEx08.setOnClickListener{
            val intent = Intent(this, Ex08Activity::class.java)

            startActivity(intent)
        }

        val btnEx09 = findViewById<Button>(R.id.btnEx09)
        btnEx09.setOnClickListener{
            val intent = Intent(this, Ex09Activity::class.java)

            startActivity(intent)
        }
    }
}