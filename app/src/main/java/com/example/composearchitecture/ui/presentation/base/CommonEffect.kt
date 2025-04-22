package com.example.composearchitecture.ui.presentation.base

sealed class CommonEffect {

    data object SessionTimeout : CommonEffect()
    data class ErrorMessage(val error: String) : CommonEffect()
    data class ResErrorMessage(val resId: Int) : CommonEffect()
    data class SuccessMessage(val message: String) : CommonEffect()
    data class ResSuccessMessage(val redId: Int) : CommonEffect()
}