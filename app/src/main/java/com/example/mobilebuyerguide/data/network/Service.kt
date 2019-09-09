package com.example.mobilebuyerguide.data.network

import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.data.entity.MobileImage
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {
    @GET("/api/mobiles/")
    fun getMobileList(): Call<List<Mobile>>

    @GET("/api/mobiles/{id}/images/")
    fun getMobileImageList(@Path("id") id: Int): Call<List<MobileImage>>
}
