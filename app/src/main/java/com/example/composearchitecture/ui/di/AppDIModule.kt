package com.example.composearchitecture.ui.di

import com.example.composearchitecture.ui.presentation.display.splash.SplashScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appDIModule = module {
    viewModel{
        SplashScreenViewModel()
    }
}