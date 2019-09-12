package com.example.mobilebuyerguide.presentation.mapper

import com.example.mobilebuyerguide.data.entity.Mobile
import com.example.mobilebuyerguide.presentation.display.MobileItemDisplay

class MobileItemMapper {

    fun transformMobileList(mobileList: List<Mobile>): List<MobileItemDisplay> {
        return mobileList.map { mobile -> transform(mobile) }
    }

    private fun transform(mobile: Mobile): MobileItemDisplay {
        return MobileItemDisplay(
            mobile.name,
            mobile.description,
            mobile.price,
            mobile.rating,
            mobile.thumbImageURL
        )
    }
}
