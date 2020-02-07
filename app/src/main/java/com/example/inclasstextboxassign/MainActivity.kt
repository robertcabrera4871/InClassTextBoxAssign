package com.example.inclasstextboxassign

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Time
import java.time.Instant
import java.time.LocalTime
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var startTime = Calendar.getInstance().timeInMillis
    var timeSinceLast: Long = 0
    var clickTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myTextBox.setOnClickListener { view ->
             clickTime = Calendar.getInstance().timeInMillis
             timeSinceLast = (clickTime - startTime) / 1000
            (view as TextView).text = timeSinceLast.toString().plus(getString(R.string.seconds_passed))
            startTime = clickTime
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
