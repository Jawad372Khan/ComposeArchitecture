package com.example.composearchitecture.ui.presentation.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composearchitecture.ui.presentation.display.splash.SplashScreen
import com.example.composearchitecture.ui.presentation.display.splash.SplashScreenViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun SetUpNavGraph(
    navController: NavHostController = rememberNavController(),
    startDestination: Any = Screens.SplashScreen
) {
    NavHost(
        modifier = Modifier,
        navController = navController,
        startDestination = startDestination,
        enterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(300)
            )
        },
        exitTransition = {
            slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(300)
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(300)
            )
        },
        popExitTransition = {
            slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(300)
            )
        }
    ) {
        composable<Screens.SplashScreen> {
            val viewModel: SplashScreenViewModel = koinViewModel()
            SplashScreen(
                navigation = {
                    handleNavigation(it, navController)
                },
                state = viewModel.state,
                actionEvent = viewModel::actionEvent,
            )
        }
    }
}