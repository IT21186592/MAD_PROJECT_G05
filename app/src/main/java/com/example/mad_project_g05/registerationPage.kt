package com.example.mad_project_g05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mad_project_g05.databinding.ActivityRegisterationPageBinding

class registerationPage : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterationPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterationPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener{
            startActivity(Intent(this,loginPage::class.java))
        }
        binding.tvHaveAccount.setOnClickListener{
            startActivity(Intent(this,loginPage::class.java))
        }
    }
}