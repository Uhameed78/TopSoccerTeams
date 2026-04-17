package com.example.topsoccerteams

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import java.util.Arrays
import android.util.Log
//
fun logArrayValues(arr: Array<String>) {
    Log.v("ArrayValues", Arrays.toString(arr))
}

class MainActivity : AppCompatActivity() {
    //
    //
    val teams = arrayOf<String>("Bayern Munchen", "Arsenal", "Paris Saint-Germain", "Barcelona", "Real Madrid", "Inter Milan", "Manchester City", "Borussia Dortmund", "Liverpool FC", "Sporting")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //
        logArrayValues(teams)

        //
        val teamstxtView = findViewById<TextView>(R.id.teamstxtView)
        //
        var teamsDisplay = ""
        for (team in teams) {
            teamsDisplay += "${team}\n"
        }

        //
        teamstxtView.text = teamsDisplay



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}