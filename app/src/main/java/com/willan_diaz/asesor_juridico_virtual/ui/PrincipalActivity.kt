package com.willan_diaz.asesor_juridico_virtual.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.willan_diaz.asesor_juridico_virtual.R
import com.willan_diaz.asesor_juridico_virtual.databinding.ActivityPrincipalBinding
import com.willan_diaz.asesor_juridico_virtual.logic.login.LoginUseCase
import com.willan_diaz.asesor_juridico_virtual.ui.core.Constants

class PrincipalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.extras.let {
            val userId = it?.getInt(Constants.USR_ID)
            if(userId != null){
                val  user = LoginUseCase().getUserNAme(userId)
                binding.txtUsrId.text = user.firstName.toString()
            }
            else{
                Snackbar.make(binding.txtUsrId,"Ocurrio un error", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}