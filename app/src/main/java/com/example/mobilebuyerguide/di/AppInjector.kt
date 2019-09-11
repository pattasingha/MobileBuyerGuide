package com.example.mobilebuyerguide.di

object AppInjector {

    fun init(mobileBuyerApplication: MobileBuyerApplication){
        DaggerAppComponent.builder()
            .application(mobileBuyerApplication)
            .build()
            .inject(mobileBuyerApplication)
    }
}
