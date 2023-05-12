package com.example.uts_160420027_satusehat.model

import com.google.gson.annotations.SerializedName

data class User(
    val id:String?,
    val name:String?,
    val bornDate:String?,
    val address:String?
)
data class Notification(
    val id:String?,
    val title:String?,
    val description:String?,
    @SerializedName("photo_url")
    val photoUrl:String?
)

data class Home(
    val id: String?,
    val title: String?,
    val donation: String?,
    val description: String?,
    val photoUrl:String
)