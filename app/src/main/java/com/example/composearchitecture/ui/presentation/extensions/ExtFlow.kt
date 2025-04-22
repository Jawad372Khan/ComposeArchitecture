package com.example.composearchitecture.ui.presentation.extensions

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow


fun <T> Flow<T>.collectOnVmScope(viewModel: ViewModel, action: suspend (T) -> Unit) {
    with(viewModel) {
        vmScope {
            collect { action.invoke(it) }
        }
    }
}