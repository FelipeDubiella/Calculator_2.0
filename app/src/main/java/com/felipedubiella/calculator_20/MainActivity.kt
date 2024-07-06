package com.felipedubiella.calculator_20

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.felipedubiella.calculator_20.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        with(binding) {

            val calc = tvCalc

            divide.setOnClickListener {
                calc.text = "${calc.text}/"
            }
            X.setOnClickListener {
                calc.text = "${calc.text}*"
            }
            seven.setOnClickListener {
                calc.text = "${calc.text}7"
            }
            eight.setOnClickListener {
                calc.text = "${calc.text}8"
            }
            nine.setOnClickListener {
                calc.text = "${calc.text}9"
            }
            plus.setOnClickListener {
                calc.text = "${calc.text}+"
            }
            four.setOnClickListener {
                calc.text = "${calc.text}4"
            }
            five.setOnClickListener {
                calc.text = "${calc.text}5"
            }
            six.setOnClickListener {
                calc.text = "${calc.text}6"
            }
            minus.setOnClickListener {
                calc.text = "${calc.text}-"
            }
            one.setOnClickListener {
                calc.text = "${calc.text}1"
            }
            two.setOnClickListener {
                calc.text = "${calc.text}2"
            }
            three.setOnClickListener {
                calc.text = "${calc.text}3"
            }
            zero.setOnClickListener {
                calc.text = "${calc.text}0"
            }
            dot.setOnClickListener {
                calc.text = "${calc.text}."
            }
            clear.setOnClickListener {
                calc.text = ""
                tvResult.text = ""
            }
            del.setOnClickListener {
                calc.text = calc.text.dropLast(1)
            }
            equal.setOnClickListener {
                val resultCalc = Expression(calc.text.toString()).calculate()

                if (resultCalc.isNaN()) {
                    tvResult.text = "Invalid Expression"
                } else {
                    tvResult.text = resultCalc.toString()
                    tvCalc.text = resultCalc.toString()
                }


            }
        }

    }
}

