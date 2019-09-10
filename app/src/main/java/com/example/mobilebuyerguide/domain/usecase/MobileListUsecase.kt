package com.example.mobilebuyerguide.domain.usecase

import android.util.Log
import com.example.mobilebuyerguide.data.dataSource.DataSource
import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.data.repository.MobileRepository
import com.example.mobilebuyerguide.domain.contract.CallBackInterface
import com.example.mobilebuyerguide.domain.contract.MobileListDomainContract
import io.reactivex.Observable

class MobileListUsecase: CallBackInterface {

    private val mobileRepository = MobileRepository()
    private lateinit var mobileObservable: Observable<List<Mobile>>
    private lateinit var mobileListContract: MobileListDomainContract
    private lateinit var mobileList: List<Mobile>

    override fun callBackResponse(): Observable<List<Mobile>> {
        mobileObservable = mobileRepository.getMobileListObservable()
        return mobileObservable
    }

//    init {
//        mobileRepository.setDataSource(this)
//    }
//
//    override fun sendMobileList(mobileList: List<Mobile>) {
//        this.mobileList = mobileList
//        mobileListContract.sendMobileList(mobileList)
//        Log.d("usecase", mobileList.toString())
//    }
//
//    fun getMobileList() {
//        mobileRepository.getMobileList()
//    }
//
//    fun setMobileListContract(mobileListContract: MobileListDomainContract) {
//        this.mobileListContract = mobileListContract
//    }
}