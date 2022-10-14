package com.example.chatapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.example.chatapp.R
import com.example.chatapp.ui.theme.LIST_ITEM_HEIGHT

@Composable
fun Profile(size: Dp){
    Image(
        modifier = Modifier
            .clip(CircleShape)
            .size(size),
        contentScale = ContentScale.Crop,
        painter = painterResource(id = R.drawable.saurab),
        contentDescription = null
    )
}