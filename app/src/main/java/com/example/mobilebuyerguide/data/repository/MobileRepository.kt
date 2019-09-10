package com.example.mobilebuyerguide.data.repository

import android.util.Log
import com.example.mobilebuyerguide.data.dataSource.DataSource
import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.data.network.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MobileRepository {

    private val service = Api.api
    private lateinit var dataSource: DataSource

    fun getMobileList() {
        service.getMobileList().enqueue(object : Callback<List<Mobile>> {
            override fun onFailure(call: Call<List<Mobile>>, t: Throwable) {}

            override fun onResponse(call: Call<List<Mobile>>, response: Response<List<Mobile>>) {
                dataSource.sendMobileList(response.body()!!)
            }
        })
    }

    fun setDataSource(dataSource: DataSource) {
        this.dataSource = dataSource
    }
}