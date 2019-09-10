package com.example.mobilebuyerguide.presentation.presenter

import android.util.Log
import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.domain.contract.MobileListDomainContract
import com.example.mobilebuyerguide.domain.usecase.MobileListUsecase
import com.example.mobilebuyerguide.presentation.contract.MobileListContract
import com.example.mobilebuyerguide.presentation.display.MobileItemDisplay
import com.example.mobilebuyerguide.presentation.mapper.MobileItemMapper

class MobileListPresenter : MobileListDomainContract {

    private val useCase = MobileListUsecase()
    private lateinit var mobileListContractView: MobileListContract.MobileListView
    private lateinit var mobileListDisplay: List<MobileItemDisplay>

    init {
        useCase.setMobileListContract(this)
    }

    fun getMobileList() {
        useCase.getMobileList()
    }

    private fun transformMobileList(mobileList: List<Mobile>): List<MobileItemDisplay> {
        val mobileItemMapper = MobileItemMapper()
        return mobileItemMapper.transformMobileList(mobileList)
    }

    override fun sendMobileList(mobileList: List<Mobile>) {
        this.mobileListDisplay = transformMobileList(mobileList)
        mobileListContractView.showMobileList(mobileListDisplay)
    }

    fun setMobileListContractView(mobileListContractView: MobileListContract.MobileListView) {
        this.mobileListContractView = mobileListContractView
    }
}
