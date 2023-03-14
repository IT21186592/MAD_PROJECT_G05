package com.example.mad_project_g05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mad_project_g05.databinding.ActivityLoginPageBinding

class loginPage : AppCompatActivity() {

    private lateinit var binding: ActivityLoginPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            startActivity(Intent(this,homePage::class.java))
        }

        binding.tvHaventAccount.setOnClickListener{
            startActivity(Intent(this,registerationPage::class.java))
        }
    }
}