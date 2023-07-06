package com.example.calcapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import com.example.calcapp2.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)







        binding.btnmodulus.setOnClickListener { calculations('%') }
        binding.btnsubtract.setOnClickListener { calculations('-') }
        binding.btnadd.setOnClickListener { calculations('+') }
        binding.btnmodulus.setOnClickListener { calculations('*') }
    }

    fun calculations(operator: Char) {
        binding.tilFirstNumber.error = null
        binding.tilSecondNumber.error = null
        val num1 = binding.etFirstNumber.text.toString()
        val num2 = binding.etSecondNumber.text.toString()
        var error = false
        if (num1.isBlank()) {
            binding.tilFirstNumber.error = "Num 1 is required"
            error = true
        }
        if (num2.isBlank()) {
            binding.tilSecondNumber.error = "Num 2 is required"
            error = true
        }
        if (!error) {
            val firstNum = num1.toDouble()
            val secondNum = num2.toDouble()
            val result = when (operator) {
                '+' -> firstNum + secondNum
                '-' -> firstNum - secondNum
                '*' -> firstNum * secondNum
                '%' -> firstNum % secondNum
                else -> throw IllegalArgumentException("Invalid operator:$operator")


            }
            binding.btnresult.text = result.toString()
        }
    }
}

