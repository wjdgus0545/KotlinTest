package com.example.ch7_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.widget.CompoundButton
import com.example.ch7_layout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkbox.setOnCheckedChangeListener{
            compoundButton, b ->
            Log.d("ohsopp", "Click checkbox")
        }
    }

}