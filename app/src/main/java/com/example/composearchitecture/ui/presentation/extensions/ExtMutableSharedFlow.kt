package com.example.composearchitecture.ui.presentation.extensions

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableSharedFlow


fun <T> MutableSharedFlow<T>.emitOnVmScope(viewModel: ViewModel, value: T) {
    with(viewModel) {
        vmScope { emit(value) }
    }
}


fun <T> MutableSharedFlow<T>.emitOnIoScope(viewModel: ViewModel, value: T) {
    with(viewModel) {
        ioScope { emit(value) }
    }
}

fun <T> MutableSharedFlow<T>.emitOnDefaultScope(viewModel: ViewModel, value: T) {
    with(viewModel) {
        defaultScope { emit(value) }
    }
}



fun <T> MutableSharedFlow<T>.emitOnMainScope(viewModel: ViewModel, value: T) {
    with(viewModel) {
        mainScope { emit(value) }
    }
}