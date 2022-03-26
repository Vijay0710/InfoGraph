package com.example.graph

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import app.futured.donut.DonutProgressView
import app.futured.donut.DonutSection

class DoughnutChart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doughnut_chart)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val progValue = findViewById<TextView>(R.id.progressBarVal)
        progressBar.progress = progValue.text.toString().toInt()
    }
}