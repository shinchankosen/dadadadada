package com.example.dadadadada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*start.setOnClickListener{
            start.text = "uncho"
        }*/
        val X = 850;
        val Y = 1400;
        tap1.setOnClickListener{
            tap1.x = (0..X).random().toFloat();
            tap1.y = (0..Y).random().toFloat();
        }
        tap2.setOnClickListener{
            tap2.x = (0..X).random().toFloat();
            tap2.y = (0..Y).random().toFloat();
        }
        tap3.setOnClickListener{
            tap3.x = (0..X).random().toFloat();
            tap3.y = (0..Y).random().toFloat();
        }
        tap4.setOnClickListener{
            tap4.x = (0..X).random().toFloat();
            tap4.y = (0..Y).random().toFloat();
        }
        tap5.setOnClickListener{
            tap5.x = (0..X).random().toFloat();
            tap5.y = (0..Y).random().toFloat();
        }
    }
}