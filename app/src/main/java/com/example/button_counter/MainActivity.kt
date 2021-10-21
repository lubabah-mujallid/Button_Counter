package com.example.button_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.button_counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)//change to your biv
        setContentView(binding.root)


    }

    fun counterUp(view: View) {
        var num = binding.tvMain.text.toString().toInt()
        num ++
        binding.tvMain.text = num.toString()
    }
}