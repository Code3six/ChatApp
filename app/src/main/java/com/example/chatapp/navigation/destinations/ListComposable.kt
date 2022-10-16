package com.example.chatapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.chatapp.ui.screen.ListScreen
import com.example.chatapp.util.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToProfileScreen: () -> Unit
){
    composable(
        route = LIST_SCREEN
    ){
        ListScreen(navigateToProfileScreen = navigateToProfileScreen)
    }
}