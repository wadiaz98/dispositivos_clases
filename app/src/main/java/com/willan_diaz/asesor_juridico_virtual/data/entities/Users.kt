package com.willan_diaz.asesor_juridico_virtual.data.entities
data class Users (var id: Int,
                  var userName: String,
                  var password: String
){
    constructor(nombre: String,
                apellido: String,
                perfil: String): this(0, "", "")

    constructor():this(0,"","")
}