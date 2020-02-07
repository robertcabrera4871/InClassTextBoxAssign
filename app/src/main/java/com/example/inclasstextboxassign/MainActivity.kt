package com.example.inclasstextboxassign

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myTextBox.setOnClickListener { view ->
            var textNumber = (view as TextView).text.toString().toInt()
            textNumber++
            view.text = textNumber.toString()
        }
        var changeColor = fun (v: View?){
            (v as ConstraintLayout).setBackgroundColor(Color.rgb(Random.nextInt(),Random.nextInt(),Random.nextInt()))
        }
        myLayout.setOnLongClickListener {
            changeColor(it)
            true
        }

    }

}
