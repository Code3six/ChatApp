package com.example.chatapp.navigation

import androidx.navigation.NavHostController
import com.example.chatapp.util.LIST_SCREEN
import com.example.chatapp.util.PROFILE_SCREEN
import com.example.chatapp.util.SPLASH_SCREEN

class Screens(navController: NavHostController) {

    val splash: () -> Unit = {
        navController.navigate(route = LIST_SCREEN){
            popUpTo(SPLASH_SCREEN) {inclusive = true}
        }
    }

    val list: () -> Unit = {
        navController.navigate(route = LIST_SCREEN){
            popUpTo(LIST_SCREEN) {inclusive = true}
        }
    }

    val profile: () -> Unit = {
        navController.navigate(route = PROFILE_SCREEN)
    }
}