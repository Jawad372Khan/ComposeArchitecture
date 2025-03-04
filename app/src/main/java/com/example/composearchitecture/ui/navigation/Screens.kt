package com.example.composearchitecture.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screens {
    @Serializable
    data object AppEntryPoint : Screens()
}