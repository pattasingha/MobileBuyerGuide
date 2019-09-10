package com.example.mobilebuyerguide.presentation.presenter

import android.annotation.SuppressLint
import android.util.Log
import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.domain.usecase.MobileListUsecase
import com.example.mobilebuyerguide.presentation.contract.MobileListContract
import com.example.mobilebuyerguide.presentation.display.MobileItemDisplay
import com.example.mobilebuyerguide.presentation.mapper.MobileItemMapper
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MobileListPresenter {

    private val useCase = MobileListUsecase()
    private lateinit var mobileListContractView: MobileListContract.MobileListView
    private lateinit var mobileListDisplay: List<MobileItemDisplay>

    @SuppressLint("CheckResult")
    fun getMobileList() {
        useCase.callBackResponse().observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({result -> handleResponse(result)},
                {error -> Log.d("ERROR", "callback error")})
    }

    private fun handleResponse(mobileList: List<Mobile>) {
        this.mobileListDisplay = transformMobileList(mobileList)
        mobileListContractView.showMobileList(mobileListDisplay)
    }

    private fun transformMobileList(mobileList: List<Mobile>): List<MobileItemDisplay> {
        val mobileItemMapper = MobileItemMapper()
        return mobileItemMapper.transformMobileList(mobileList)
    }

    fun setMobileListContractView(mobileListContractView: MobileListContract.MobileListView) {
        this.mobileListContractView = mobileListContractView
    }
}
