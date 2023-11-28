package com.willan_diaz.asesor_juridico_virtual.data.entities
data class Users (
                  val userName: String? = null,
                  val password: String? = null
){
    var userId :Int = -1
    var firstName:String = ""
    var lastName:String = ""
    var profile:String = ""

    constructor(userName: String?, password: String?, userId:Int)
    :this(userName,password){
        this.userId = userId
    }
    constructor(id:Int, userName:String?, password:String?, profile:String)
        :this(userName,password){
        this.profile = profile
    }
       constructor(id:Int, userName:String?, password:String?, firstName:String, lastName:String)
            :this(userName,password){
        this.firstName = firstName
        this.lastName = lastName
            }
}