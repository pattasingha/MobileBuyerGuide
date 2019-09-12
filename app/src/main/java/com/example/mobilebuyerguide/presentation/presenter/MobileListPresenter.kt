package com.example.mobilebuyerguide.presentation.presenter

import android.annotation.SuppressLint
import android.util.Log
import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.domain.usecase.MobileListUseCase
import com.example.mobilebuyerguide.presentation.contract.MobileListContract
import com.example.mobilebuyerguide.presentation.display.MobileItemDisplay
import com.example.mobilebuyerguide.presentation.mapper.MobileItemMapper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MobileListPresenter @Inject constructor(private var useCase: MobileListUseCase) :
    MobileListContract.MobileListPresenter {

    private lateinit var view: MobileListContract.MobileListView
    private lateinit var mobileListDisplay: List<MobileItemDisplay>

    fun setView(view: MobileListContract.MobileListView){
        this.view = view
    }

    @SuppressLint("CheckResult")
    override fun getMobileList() {
        useCase.callBackResponse().observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ result -> handleResponse(result) },
                { Log.d("ERROR", "callback error") })
    }

    private fun handleResponse(mobileList: List<Mobile>) {
        this.mobileListDisplay = transformMobileList(mobileList)
        view.showMobileList(mobileListDisplay)
    }

    private fun transformMobileList(mobileList: List<Mobile>): List<MobileItemDisplay> {
        val mobileItemMapper = MobileItemMapper()
        return mobileItemMapper.transformMobileList(mobileList)
    }
}
