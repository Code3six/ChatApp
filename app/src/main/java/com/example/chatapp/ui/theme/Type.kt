package com.example.chatapp.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.chatapp.R

val Roboto = FontFamily(
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_light, FontWeight.Light)
)

val RobotoCondensed = FontFamily(
    Font(R.font.robotocondensed_regular, FontWeight.Normal),
    Font(R.font.robotocondensed_light, FontWeight.Light)
)

val Typography.appHeader: TextStyle
    @Composable
    get() = MaterialTheme.typography.h1

val Typography.name: TextStyle
    @Composable
    get() = MaterialTheme.typography.body1

val Typography.notification: TextStyle
    @Composable
    get() = MaterialTheme.typography.body2

val Typography.nameInformation: TextStyle
    @Composable
    get() = MaterialTheme.typography.h3

val Typography.nameNoChat: TextStyle
    @Composable
    get() = MaterialTheme.typography.h4

val Typography.chatGray: TextStyle
    @Composable
    get() = MaterialTheme.typography.subtitle1

val Typography.chatBlack: TextStyle
    @Composable
    get() = MaterialTheme.typography.h5

val Typography.listTime: TextStyle
    @Composable
    get() = MaterialTheme.typography.h6



val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Roboto,
        fontSize = 28.sp,
        fontWeight = FontWeight.Medium
    ),
    body1 = TextStyle(
        fontFamily = RobotoCondensed,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    body2 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        fontSize = 13.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp
    ),
    h3 = TextStyle(
        fontFamily = RobotoCondensed,
        fontWeight = FontWeight.Light,
        fontSize = 20.sp
    ),
    h4 = TextStyle(
        fontFamily = RobotoCondensed,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
    h5 = TextStyle(
        fontFamily = RobotoCondensed,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp
    ),
    h6 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp
    )
)