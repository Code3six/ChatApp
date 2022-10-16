package com.example.chatapp.ui.screen.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chatapp.R
import com.example.chatapp.ui.theme.*

@Composable
fun ProfileBar(
    navigateToListScreen: () -> Unit
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.appTheme)
            .height(BAR_HEIGHT),
        verticalAlignment = Alignment.CenterVertically
    ){
        IconButton(onClick = {
            navigateToListScreen()
        }) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Arrow Back Icon",
                tint = MaterialTheme.colors.backgroundColor
            )
        }
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
        ProfileBar({})
    }
}
