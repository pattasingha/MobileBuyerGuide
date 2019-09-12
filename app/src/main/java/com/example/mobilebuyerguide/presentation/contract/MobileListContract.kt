package com.example.mobilebuyerguide.presentation.contract

import com.example.mobilebuyerguide.presentation.display.MobileItemDisplay

interface MobileListContract {
    interface MobileListPresenter {
        fun getMobileList()
    }

    interface MobileListView {
        fun showMobileList(mobileList: List<MobileItemDisplay>)
    }
}
