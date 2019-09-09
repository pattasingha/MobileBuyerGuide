package com.example.mobilebuyerguide.data.dataSource

import com.example.mobilebuyerguide.data.entity.Mobile

interface DataSource {
    fun sendMobileList(mobile: List<Mobile>?)
}