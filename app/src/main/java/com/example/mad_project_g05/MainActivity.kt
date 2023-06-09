package com.example.mad_project_g05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mad_project_g05.databinding.ActivityLoginPageBinding
import com.example.mad_project_g05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            startActivity(Intent(this, loginPage::class.java))
        }

        binding.btnRegister.setOnClickListener{
            startActivity(Intent(this,registerationPage::class.java))
        }
    }

}