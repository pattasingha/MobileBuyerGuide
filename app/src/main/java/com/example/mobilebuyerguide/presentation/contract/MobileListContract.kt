package com.example.mobilebuyerguide.presentation.contract

import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.presentation.display.MobileItemDisplay

interface MobileListContract {
    interface MobileListPresenter {
        fun getMobileList(): List<MobileItemDisplay>
//        fun transformMobileList(mobileList: List<Mobile>)
    }
    interface MobileListView {
        fun showMobileList(mobileList: List<MobileItemDisplay>)
    }
}