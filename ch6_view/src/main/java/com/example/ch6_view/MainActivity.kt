package com.example.ch6_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ch6_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btn1.setOnClickListener{
            binding.btn1.visibility = View.INVISIBLE
            binding.imgBtn.visibility=View.VISIBLE
        }

        binding.imgBtn.setOnClickListener{
            binding.btn1.visibility = View.VISIBLE
            binding.imgBtn.visibility = View.INVISIBLE
        }
    }
}