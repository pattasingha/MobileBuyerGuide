package com.example.mobilebuyerguide.domain.contract

import com.example.mobilebuyerguide.data.entity.Mobile
import io.reactivex.Observable

interface CallBackInterface {
    fun callBackResponse(): Observable<List<Mobile>>
}