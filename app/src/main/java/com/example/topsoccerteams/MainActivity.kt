package com.example.topsoccerteams

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import java.util.Arrays
class MainActivity : AppCompatActivity() {
    //
    //
    val teams = arrayOf<String>("Bayern Munchen", "Arsenal", "Paris Saint-Germain", "Barcelona", "Real Madrid", "Inter Milan", "Manchester City", "Borussia Dortmund", "Liverpool FC", "Sporting")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //
        val teamstxtView = findViewById<TextView>(R.id.teamstxtView)
        //
        teamstxtView.text = teams[0]
        teams[0] = "Bayern Munich"
        //
        teamstxtView.text = Arrays.toString(teams)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}