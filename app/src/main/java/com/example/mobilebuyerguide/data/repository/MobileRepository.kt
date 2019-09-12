package com.example.mobilebuyerguide.data.repository

import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.data.network.Api
import io.reactivex.Observable
import javax.inject.Inject

class MobileRepository @Inject constructor(private var api: Api) {

    private val service = api.getService()

    fun getMobileListObservable(): Observable<List<Mobile>> {
        return service.getMobileList()
    }
}
