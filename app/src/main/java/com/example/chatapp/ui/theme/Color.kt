package com.example.chatapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val BGCOLOR = Color(0xfffafafa)
val APP_COLOR = Color(0xffA73ACA)
val APP_COLOR2 = Color(0xff9B2FD4)
val APP_COLOR3 = Color(0xff790CF1)
val TEXT = Color(0xff1f1f1f)
val SEEN_TEXT = Color(0xff979797)

val Colors.backgroundColor: Color
    @Composable
    get() = if(isSystemInDarkTheme()) Color(0xff1f1f1f) else BGCOLOR

val Colors.appTheme: Color
    @Composable
    get() = if(isSystemInDarkTheme()) Color(0xff1f1f1f) else APP_COLOR

val Colors.notification: Color
    @Composable
    get() = if(isSystemInDarkTheme()) APP_COLOR2 else APP_COLOR3

val Colors.text: Color
    @Composable
    get() = if(isSystemInDarkTheme()) BGCOLOR else TEXT

val Colors.seenText: Color
    @Composable
    get() = SEEN_TEXT


