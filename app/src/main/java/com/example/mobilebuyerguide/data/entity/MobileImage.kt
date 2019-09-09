package com.example.mobilebuyerguide.data.entity

import com.google.gson.annotations.SerializedName

data class MobileImage(
    @SerializedName("url")
    val url: String,
    @SerializedName("mobile_id")
    val mobileId: Int,
    @SerializedName("id")
    val id: Int
)
