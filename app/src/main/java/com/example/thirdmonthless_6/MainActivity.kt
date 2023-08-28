package com.example.thirdmonthless_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thirdmonthless_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container, SongFragment()).commit()
    }
}