package com.example.mobilebuyerguide.di

import com.example.mobilebuyerguide.data.network.Api
import com.example.mobilebuyerguide.data.repository.MobileRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Singleton
    @Provides
    fun provideApi() = Api()

    @Singleton
    @Provides
    fun provideMobileRepository(api: Api) = MobileRepository(api)
}