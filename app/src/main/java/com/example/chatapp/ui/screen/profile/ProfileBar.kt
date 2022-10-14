package com.example.chatapp.ui.screen.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chatapp.ui.theme.*

@Composable
fun ProfileBar(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.appTheme)
            .height(BAR_HEIGHT)
            .padding(SCREEN_PADDING, 0.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = "Profile: ",
            style = MaterialTheme.typography.appHeader,
            color = MaterialTheme.colors.backgroundColor
        )

        Text(
            text = "Saurab Gupta",
            style = MaterialTheme.typography.appHeader,
            color = MaterialTheme.colors.backgroundColor
        )
    }
}

@Preview
@Composable
fun ProfileBarPreview(){
    ChatAppTheme {
        ProfileBar()
    }
}
