package com.willan_diaz.asesor_juridico_virtual.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.willan_diaz.asesor_juridico_virtual.R
import com.willan_diaz.asesor_juridico_virtual.databinding.ActivityLoginBinding
import com.willan_diaz.asesor_juridico_virtual.logic.login.SingIn

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val singIn: SingIn = SingIn()

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
            var usr = binding.editTextUsr.text.toString()
            var pas = binding.editTextTextPassword.text.toString()
            if(!singIn.checkUserandPassword(usr,pas)){
                Snackbar.make(binding.buttonLogin, "Usuario o contraseña incorrecto", Snackbar.LENGTH_SHORT)
            }
            else{
                val intentImpl = Intent()
                intentImpl.action = Intent.ACTION_VIEW
                intentImpl.putExtra(Intent.EXTRA_TEXT, "Mi primera chamba")
                intentImpl.type="text/plain"
                startActivity(intentImpl)

                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)

                val intentExp = Intent(
                    this,
                    MainActivity::class.java
                )
                intentExp.putExtra("chamba", "Mi primera chamba")
            }

        }

        binding.imageViewFacebook.setOnClickListener{
            val intent = Intent.ACTION_VIEW

        }
    }

}