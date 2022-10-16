package com.example.chatapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.chatapp.ui.screen.SplashScreen
import com.example.chatapp.util.SPLASH_SCREEN

fun NavGraphBuilder.splashComposable(
    navigateToListScreen:() -> Unit
){
    composable(
        route = SPLASH_SCREEN,
    ) {
        SplashScreen(navigateToListScreen = navigateToListScreen)
    }
}