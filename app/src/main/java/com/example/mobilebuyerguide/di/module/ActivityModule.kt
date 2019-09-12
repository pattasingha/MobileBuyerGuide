package com.example.mobilebuyerguide.di.module

import com.example.mobilebuyerguide.di.module.FragmentModule
import com.example.mobilebuyerguide.view.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeMainActivity(): MainActivity
}
