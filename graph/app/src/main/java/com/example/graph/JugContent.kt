package com.example.graph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView

class JugContent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jug_content)

        val pinkDoughnut = findViewById<View>(R.id.pink_doughnut)
        val progressBarPink = pinkDoughnut.findViewById<ProgressBar>(R.id.progressBar)
        val pinkProgressBarVal = pinkDoughnut.findViewById<TextView>(R.id.progressBarVal)
        progressBarPink.progress = 20
        pinkProgressBarVal.text = 20.toString()


        val redDoughnut = findViewById<View>(R.id.red_doughnut)
        val progressBarRed = redDoughnut.findViewById<ProgressBar>(R.id.progressBar)
        val redProgressBarVal = redDoughnut.findViewById<TextView>(R.id.progressBarVal)
        progressBarRed.progress = 60
        redProgressBarVal.text = 60.toString()

        val blueDoughnut = findViewById<View>(R.id.blue_doughnut)
        val progressBarBlue = blueDoughnut.findViewById<ProgressBar>(R.id.progressBar)
        val blueProgressBarVal = blueDoughnut.findViewById<TextView>(R.id.progressBarVal)
        progressBarBlue.progress = 80
        blueProgressBarVal.text = 80.toString()
//
        val orangeDoughnut = findViewById<View>(R.id.orange_doughnut)
        val progressBarOrange = orangeDoughnut.findViewById<ProgressBar>(R.id.progressBar)
        val orangeProgressBarVal = orangeDoughnut.findViewById<TextView>(R.id.progressBarVal)
        progressBarOrange.progress = 70
        orangeProgressBarVal.text = 70.toString()
//
        val greenDoughnut = findViewById<View>(R.id.green_doughnut)
        val progressBarGreen = greenDoughnut.findViewById<ProgressBar>(R.id.progressBar)
        val greenProgressBarVal = greenDoughnut.findViewById<TextView>(R.id.progressBarVal)
        progressBarGreen.progress = 100
        greenProgressBarVal.text = 100.toString()
//
//        val pinkDoughnut = findViewById<View>(R.id.pink_doughnut)
//        val progressBarPink = pinkDoughnut.findViewById<ProgressBar>(R.id.progressBar)
//        val pinkProgressBarVal = pinkDoughnut.findViewById<TextView>(R.id.progressBarVal)
//        progressBarPink.progress = 20
//        pinkProgressBarVal.text = 20.toString()

    }
}