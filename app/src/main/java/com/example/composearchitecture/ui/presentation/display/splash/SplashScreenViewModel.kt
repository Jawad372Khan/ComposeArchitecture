package com.example.composearchitecture.ui.presentation.display.splash

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SplashScreenViewModel : ViewModel() {
    var state by mutableStateOf(SplashScreenState())
        private set

    fun actionEvent(actionEvent: ActionEvent){
        when(actionEvent){

            else -> {}
        }
    }

    sealed class ActionEvent {

    }
}