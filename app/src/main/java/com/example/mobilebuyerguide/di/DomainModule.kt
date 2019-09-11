package com.example.mobilebuyerguide.di

import com.example.mobilebuyerguide.data.repository.MobileRepository
import com.example.mobilebuyerguide.domain.usecase.MobileListUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DomainModule {

    @Singleton
    @Provides
    fun provideMobileListUseCase(mobileRepository: MobileRepository) = MobileListUseCase(mobileRepository)
}