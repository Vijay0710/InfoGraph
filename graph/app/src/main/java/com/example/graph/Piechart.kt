package com.example.graph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.anychart.AnyChart
import com.anychart.AnyChartView
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry

class Piechart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piechart)

        val pie = AnyChart.pie()

        val data: MutableList<DataEntry> = ArrayList()
        data.add(ValueDataEntry("John", 10000))
        data.add(ValueDataEntry("Jake", 12000))
        data.add(ValueDataEntry("Peter", 18000))

        pie.data(data)

        val anyChartView = findViewById<View>(R.id.any_chart_view) as AnyChartView
        anyChartView.setChart(pie)
    }
}