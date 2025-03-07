package com.example.composearchitecture.ui.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screens {
    @Serializable
    data object SplashScreen : Screens()
}