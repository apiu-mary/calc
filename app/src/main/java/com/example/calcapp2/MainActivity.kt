package com.example.calcapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstNumber: TextInputLayout
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var etFirstNumber: TextInputEditText
    lateinit var etSecondNumber: TextInputEditText
    lateinit var btnresult: Button
    lateinit var btnmultiply: Button
    lateinit var btnmodulus: Button
    lateinit var btnsubtract: Button
    lateinit var btnadd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validateresults()

//        btnresult.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }

        }




    fun castViews(){
        tilFirstNumber=findViewById(R.id.tilFirstNumber)
        tilSecondNumber=findViewById(R.id.tilSecondNumber)
        etFirstNumber=findViewById(R.id.etFirstNumber)
        etSecondNumber=findViewById(R.id.tilSecondNumber)
        btnresult=findViewById(R.id.btnresult)
        btnmultiply=findViewById(R.id.btnmodulus)
        btnsubtract=findViewById(R.id.btnmodulus)
        btnadd=findViewById(R.id.btnadd)
        btnmodulus=findViewById(R.id.btnmodulus)


    }
    fun validateresults() {
        castViews()
        btnadd!!.setOnClickListener {
            val result = etFirstNumber.text.toString().toDouble()!! + etSecondNumber.text.toString()
                .toDouble()!!
            btnresult.text = result.toString()
        }

        btnmodulus!!.setOnClickListener {
            val result = etFirstNumber.text.toString().toDouble()!! % etSecondNumber.text.toString()
                .toDouble()!!
            btnresult.text.toString()
        }
        btnsubtract!!.setOnClickListener {
            val result = etFirstNumber.text.toString().toDouble()!!-etSecondNumber.text.toString().toDouble()!!
        }
        btnmultiply!!.setOnClickListener {
            val result = etFirstNumber.text.toString().toDouble()!! * etSecondNumber.text.toString()
                .toDouble()!!


//

        }


    }}
