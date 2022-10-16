package com.example.chatapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.chatapp.navigation.destinations.listComposable
import com.example.chatapp.navigation.destinations.profileComposable
import com.example.chatapp.navigation.destinations.splashComposable
import com.example.chatapp.ui.screen.SplashScreen
import com.example.chatapp.util.SPLASH_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController,
){
    val screen = remember(navController){
        Screens(navController = navController)
    }

    NavHost(navController = navController, startDestination = SPLASH_SCREEN){
        splashComposable(
            navigateToListScreen = screen.splash
        )

        listComposable(
            navigateToProfileScreen = screen.profile
        )

        profileComposable(
            navigateToListScreen = screen.list
        )
    }
}