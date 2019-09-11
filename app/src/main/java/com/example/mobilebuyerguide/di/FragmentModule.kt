package com.example.mobilebuyerguide.di

import androidx.fragment.app.Fragment
import com.example.mobilebuyerguide.view.fragment.MobileListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeMobileListFragment(): MobileListFragment
}