package com.willan_diaz.asesor_juridico_virtual.logic.login

import com.willan_diaz.asesor_juridico_virtual.data.entities.repository.DBUsers

class SingIn {

    fun checkUserandPassword(user:String, password:String): Boolean{
        var users= DBUsers().getListUsers()
        for (i in users){
            if(i.userName.equals(user) and i.password.equals(password))
                return true

        }
        return false
    }
}