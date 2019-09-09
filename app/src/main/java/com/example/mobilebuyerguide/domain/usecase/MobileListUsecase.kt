package com.example.mobilebuyerguide.domain.usecase

import com.example.mobilebuyerguide.data.dataSource.DataSource
import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.data.repository.MobileRepository

class MobileListUsecase: DataSource {
    private val mobileRepoeitory = MobileRepository()
    init {
        mobileRepoeitory.setDataSource(this)
    }

    override fun sendMobileList(mobile: List<Mobile>?) {

    }



}