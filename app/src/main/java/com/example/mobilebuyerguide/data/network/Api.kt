package com.example.mobilebuyerguide.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {
    private const val baseUrl = "https://scb-test-mobile.herokuapp.com"
    val api: Service
        get() {
            val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(Service::class.java)
        }
}
