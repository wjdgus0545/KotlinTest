package com.example.kotlintest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.example.kotlintest.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_main)

        binding.btn.setOnClickListener{
            binding.btn.visibility = View.INVISIBLE
        }


        et_age.setOnEditorActionListener { v, actionId, event ->
            if(actionId == EditorInfo.IME_ACTION_DONE){
                Login(v)
                true
            }
            else false
        }
    }

    fun Login(v: View){
        var imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(v.windowToken, 0)

        if(et_email.text.toString() == "ohsopp@naver.com" && et_password.text.toString() == "1234" &&
                et_name.text.toString() == "ohsopp" && et_age.text.toString() == "24") {
            Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show()
            val showIntent = Intent(this, JavaActivity::class.java)
            startActivity(showIntent)
        }
        else Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
    }

}