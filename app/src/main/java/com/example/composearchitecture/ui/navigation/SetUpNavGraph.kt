package com.example.composearchitecture.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SetUpNavGraph(
    navController: NavHostController = rememberNavController(),
    startDestination: Any = Screens.AppEntryPoint
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ){
        composable<Screens.AppEntryPoint> {

        }
    }
}