package com.willan_diaz.asesor_juridico_virtual.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.willan_diaz.asesor_juridico_virtual.R
import com.willan_diaz.asesor_juridico_virtual.databinding.ActivityLoginBinding
import com.willan_diaz.asesor_juridico_virtual.logic.login.LoginUseCase
import com.willan_diaz.asesor_juridico_virtual.ui.core.Constants

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val singIn: LoginUseCase = LoginUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart(){
        super.onStart()

        initControls()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun initControls(){
        binding.buttonLogin.setOnClickListener {
            val check = LoginUseCase().checkUserandPassword(binding.editTextUsr.text.toString(),
                binding.editTextTextPassword.text.toString())
            if(check > 0){
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra(Constants.USR_ID, check)
                startActivity(intent)
            }
            else{
                Snackbar.make(binding.buttonLogin,
                    "Usuario o contraseña incorrecto",
                    Snackbar.LENGTH_SHORT).show()
                binding.editTextUsr.text.clear()
                binding.editTextTextPassword.text.clear()
            }

        }
    }

}