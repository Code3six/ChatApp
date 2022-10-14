package com.example.chatapp.ui.screen.profile

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.chatapp.ui.theme.ChatAppTheme

@Composable
fun ProfileScreen(){
    Scaffold(
        topBar = {
            ProfileBar()
        },
        content = {
            ProfileContent()
        }
    )
}

@Preview
@Composable
fun ProfileScreenPreview(){
    ChatAppTheme {
        ProfileScreen()
    }
}