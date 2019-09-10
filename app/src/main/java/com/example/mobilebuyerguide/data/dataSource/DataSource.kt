package com.example.mobilebuyerguide.data.dataSource

import com.example.mobilebuyerguide.data.entity.Mobile

interface DataSource {
    fun sendMobileList(mobileList: List<Mobile>)
}