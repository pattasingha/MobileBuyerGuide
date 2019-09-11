package com.example.mobilebuyerguide.domain.usecase

import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.data.repository.MobileRepository
import com.example.mobilebuyerguide.domain.contract.CallBackInterface
import io.reactivex.Observable

class MobileListUseCase: CallBackInterface {

    private val mobileRepository = MobileRepository()
    private lateinit var mobileObservable: Observable<List<Mobile>>

    override fun callBackResponse(): Observable<List<Mobile>> {
        mobileObservable = mobileRepository.getMobileListObservable()
        return mobileObservable
    }
}