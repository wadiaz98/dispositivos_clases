package com.willan_diaz.asesor_juridico_virtual.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.willan_diaz.asesor_juridico_virtual.R
import com.willan_diaz.asesor_juridico_virtual.databinding.ActivityLoginBinding
import com.willan_diaz.asesor_juridico_virtual.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart(){
        super.onStart()
        initControl()
    }

    fun initControl(){
        binding.button.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}