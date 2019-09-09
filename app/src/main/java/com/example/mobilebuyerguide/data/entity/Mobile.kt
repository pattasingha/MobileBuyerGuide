package com.example.mobilebuyerguide.data.entity

import com.google.gson.annotations.SerializedName

data class Mobile(
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("thumbImageURL")
    val thumbImageURL: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("brand")
    val brand: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("rating")
    val rating: Double
)
