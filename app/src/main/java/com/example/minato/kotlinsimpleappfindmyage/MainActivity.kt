package com.example.minato.kotlinsimpleappfindmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*btn_Enter.setOnClickListener {
            val yearOfBirth:Int = txt_inputAge.text.toString().toInt()
            val myAge = 2017-yearOfBirth
            tv_showAge.text = "Your Age is $myAge"
        }*/
    }

    //set onclick on btn_Enter to select use method
    fun btn_FindAge(view:View){
        val yearOfBirth:Int = txt_inputAge.text.toString().toInt()
        val year:Int = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = year-yearOfBirth
1
        tv_showAge.text = "Your Age is $myAge"
    }
}
