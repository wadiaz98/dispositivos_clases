package com.willan_diaz.asesor_juridico_virtual.data.entities.repository

import com.willan_diaz.asesor_juridico_virtual.data.entities.Users

class DBUsers {

    fun getListUsers():List<Users>{

        var usr1 = Users("willan", "willan",1)

        var usr2 = Users("pablo", "pablo",2)

        var usr3 = Users("luis", "luis",3)


        var lstUsers = listOf(usr1,usr2,usr3)
        return lstUsers

    }

}