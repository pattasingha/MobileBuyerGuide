package com.example.mobilebuyerguide.di

import com.example.mobilebuyerguide.domain.usecase.MobileListUseCase
import com.example.mobilebuyerguide.presentation.presenter.MobileListPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresentationModule {

    @Singleton
    @Provides
    fun provideMobileListPresenter(useCase: MobileListUseCase) = MobileListPresenter(useCase)
}