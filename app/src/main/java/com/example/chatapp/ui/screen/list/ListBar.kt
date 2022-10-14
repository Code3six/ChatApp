package com.example.chatapp.ui.screen.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chatapp.ui.theme.*

@Composable
fun ListBar(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.appTheme)
            .height(BAR_HEIGHT)
            .padding(SCREEN_PADDING, 0.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = "User List",
            style = MaterialTheme.typography.appHeader,
            color = MaterialTheme.colors.backgroundColor
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ListBarPreview(){
    ChatAppTheme {
        Column(
            modifier = Modifier.fillMaxSize()
        ){
            ListBar()
        }
    }
}