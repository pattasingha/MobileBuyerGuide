package com.example.mobilebuyerguide.data.repository

import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.data.network.Api
import io.reactivex.Observable


class MobileRepository {

    private val service = Api.api
    private lateinit var mobileObservable: Observable<List<Mobile>>

    fun getMobileListObservable(): Observable<List<Mobile>> {
        mobileObservable = service.getMobileList()
        return mobileObservable
    }
}