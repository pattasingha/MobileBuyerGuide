package com.example.mobilebuyerguide.domain.contract

import com.example.mobilebuyerguide.data.entity.Mobile

interface MobileListDomainContract {
    fun sendMobileList(mobileList: List<Mobile>)
}