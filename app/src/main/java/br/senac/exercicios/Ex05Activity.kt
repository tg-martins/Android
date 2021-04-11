package br.senac.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class Ex05Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex05)

        val expressionTextView = findViewById<TextView>(R.id.expressionTextView)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        fun addExpression(value: String, clear: Boolean) {

            if (resultTextView.text.isNotEmpty()) {
                expressionTextView.text = ""
            }

            if (clear) {
                resultTextView.text = ""
                expressionTextView.append(value)
            } else {
                expressionTextView.append(resultTextView.text)
                expressionTextView.append(value)
                resultTextView.text = ""
            }
        }

        val btnNumberZero = findViewById<Button>(R.id.btnNumberZero)
        btnNumberZero.setOnClickListener{ addExpression(value = "0", clear = true) }

        val btnNumberOne = findViewById<Button>(R.id.btnNumberOne)
        btnNumberOne.setOnClickListener{ addExpression(value = "1", clear = true) }

        val btnNumberTwo = findViewById<Button>(R.id.btnNumberTwo)
        btnNumberTwo.setOnClickListener{ addExpression(value = "2", clear = true) }

        val btnNumberThree = findViewById<Button>(R.id.btnNumberThree)
        btnNumberThree.setOnClickListener{ addExpression(value = "3", clear = true) }

        val btnNumberFour = findViewById<Button>(R.id.btnNumberFour)
        btnNumberFour.setOnClickListener{ addExpression(value = "4", clear = true) }

        val btnNumberFive = findViewById<Button>(R.id.btnNumberFive)
        btnNumberFive.setOnClickListener{ addExpression(value = "5", clear = true) }

        val btnNumberSix = findViewById<Button>(R.id.btnNumberSix)
        btnNumberSix.setOnClickListener{ addExpression(value = "6", clear = true) }

        val btnNumberSeven = findViewById<Button>(R.id.btnNumberSeven)
        btnNumberSeven.setOnClickListener{ addExpression(value = "7", clear = true) }

        val btnNumberEight = findViewById<Button>(R.id.btnNumberEight)
        btnNumberEight.setOnClickListener{ addExpression(value = "8", clear = true) }

        val btnNumberNine = findViewById<Button>(R.id.btnNumberNine)
        btnNumberNine.setOnClickListener{ addExpression(value = "9", clear = true) }

        val btnPoint = findViewById<Button>(R.id.btnPoint)
        btnPoint.setOnClickListener{ addExpression(value = ".", clear = true) }

        // operators
        val btnDivision = findViewById<Button>(R.id.btnDivision)
        btnDivision.setOnClickListener{ addExpression(value = "/", clear = false) }

        val btnMultiplication = findViewById<Button>(R.id.btnMultiplication)
        btnMultiplication.setOnClickListener{ addExpression(value = "*", clear = false) }

        val btnSubtraction = findViewById<Button>(R.id.btnSubtraction)
        btnSubtraction.setOnClickListener{ addExpression(value = "-", clear = false) }

        val btnSum = findViewById<Button>(R.id.btnSum)
        btnSum.setOnClickListener{ addExpression(value = "+", clear = false) }

        val btnClear = findViewById<Button>(R.id.btnClear)
        btnClear.setOnClickListener{
            expressionTextView.text = ""
            resultTextView.text = ""
        }

        val btnEqual = findViewById<Button>(R.id.btnEqual)
        btnEqual.setOnClickListener {
            try {
                val expression = ExpressionBuilder(expressionTextView.text.toString()).build()

                var result = expression.evaluate()
                var longResult = result.toLong()

                if (result == longResult.toDouble()) {
                    resultTextView.text = longResult.toString()
                } else {
                    resultTextView.text = result.toString()
                }
            } catch (error: Exception) {

            }
        }
    }
}