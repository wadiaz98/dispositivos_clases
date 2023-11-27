package com.willan_diaz.asesor_juridico_virtual.data.entities.repository

import com.willan_diaz.asesor_juridico_virtual.data.entities.Users

class DBUsers {

    fun getListUsers():List<Users>{

        var usr1 = Users(1, "willan", "willan")

        var usr2 = Users(2, "pablo", "pablo")

        var usr3 = Users(3, "luis", "luis")


        var lstUsers = listOf(usr1,usr2,usr3)
        return lstUsers

    }

}