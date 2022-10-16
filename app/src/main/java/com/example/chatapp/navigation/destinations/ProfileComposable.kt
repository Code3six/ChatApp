package com.example.chatapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.chatapp.ui.screen.profile.ProfileScreen
import com.example.chatapp.util.PROFILE_SCREEN

fun NavGraphBuilder.profileComposable(
    navigateToListScreen: () -> Unit
){
    composable(
        route = PROFILE_SCREEN
    ){
        ProfileScreen(navigateToListScreen = navigateToListScreen)
    }
}