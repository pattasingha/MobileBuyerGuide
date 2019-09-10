package com.example.mobilebuyerguide.data.repository

import com.example.mobilebuyerguide.data.dataSource.DataSource
import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.data.network.Api
import io.reactivex.Observable


class MobileRepository {

    private val service = Api.api
    private lateinit var mobileObservable: Observable<List<Mobile>>
    private lateinit var dataSource: DataSource

    fun getMobileListObservable(): Observable<List<Mobile>> {
        mobileObservable = service.getMobileList()
        return mobileObservable
    }

//    fun getMobileList() {
//        service.getMobileList().enqueue(object : Callback<List<Mobile>> {
//            override fun onFailure(call: Call<List<Mobile>>, t: Throwable) {}
//
//            override fun onResponse(call: Call<List<Mobile>>, response: Response<List<Mobile>>) {
//                dataSource.sendMobileList(response.body()!!)
//            }
//        })
//    }

    fun setDataSource(dataSource: DataSource) {
        this.dataSource = dataSource
    }
}