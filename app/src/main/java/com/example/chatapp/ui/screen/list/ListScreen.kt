package com.example.chatapp.ui.screen

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.chatapp.ui.screen.list.ListBar
import com.example.chatapp.ui.screen.list.ListContent
import com.example.chatapp.ui.theme.ChatAppTheme

@Composable
fun ListScreen(
    navigateToProfileScreen: () -> Unit
){

    Scaffold(
        topBar = {
            ListBar()
        },
        content = {
            ListContent(navigateToProfileScreen = navigateToProfileScreen)
        }
    )
}

@Preview
@Composable
fun ListScreenPreview(){
    ChatAppTheme {
    }
}