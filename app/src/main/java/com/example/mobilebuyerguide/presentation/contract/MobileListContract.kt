package com.example.mobilebuyerguide.presentation.contract

import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.presentation.display.MobileItemDisplay
import io.reactivex.Observable

interface MobileListContract {
    interface MobileListPresenter {
        fun getMobileList(): Observable<List<Mobile>>
    }

    interface MobileListView {
        fun showMobileList(mobileList: List<MobileItemDisplay>)
    }
}