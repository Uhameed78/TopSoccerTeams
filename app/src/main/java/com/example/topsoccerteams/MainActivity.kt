package com.example.topsoccerteams

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.util.Log
//

//


fun logArrayValues(arr: Array<String>) {
    for (element in arr) {
        Log.d("teams", element)
    }
}

class MainActivity : AppCompatActivity() {
    //
    //
    val teams = arrayOf("Bayern Munchen", "Arsenal", "Paris Saint-Germain", "Barcelona", "Real Madrid", "Inter Milan", "Manchester City", "Borussia Dortmund", "Liverpool FC")

    fun getShortestString(arr: Array<String>): String {
        if (arr.isEmpty()) return ""
        var shortestElement = arr[0]
        for (element in arr) {
            if (element.length < shortestElement.length) {
                shortestElement = element
            }
        }
        return shortestElement
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //
        logArrayValues(teams)

        val shortestName = getShortestString(teams)
        Log.v("ShortestName", shortestName)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = getString(R.string.shortest_name_label, shortestName)

        val teamstxtView = findViewById<TextView>(R.id.teamstxtView)
        teamstxtView.text = teams.joinToString("\n")




        }
    }
