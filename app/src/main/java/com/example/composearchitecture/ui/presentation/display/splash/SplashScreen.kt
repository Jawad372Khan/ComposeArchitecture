package com.example.composearchitecture.ui.presentation.display.splash

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composearchitecture.ui.presentation.navigation.NavigationAction

@Composable
fun SplashScreen(
    navigation: (NavigationAction) -> Unit = {},
    state: SplashScreenState = SplashScreenState(),
    actionEvent: (SplashScreenViewModel.ActionEvent) -> Unit = {}
){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = state.name
        )
    }
}