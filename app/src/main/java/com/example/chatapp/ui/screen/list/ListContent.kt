package com.example.chatapp.ui.screen.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chatapp.R.drawable.saurab
import com.example.chatapp.components.Profile
import com.example.chatapp.ui.theme.*

@Composable
fun ListContent(
    navigateToProfileScreen: () -> Unit
){

    val isChatting by remember { mutableStateOf(false)}
    val user = listOf(true, true, false, false, true)

    Column(modifier = Modifier.fillMaxSize().padding(SCREEN_PADDING, 0.dp)) {
        Spacer(modifier = Modifier.height(TOP_CONTENT_PADDING))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(LIST_ITEM_SPACE)
        ){
            items(5){ i ->
                if(user[i]){
                    ListChatItem(
                        navigateToProfileScreen = navigateToProfileScreen
                    )
                } else {
                    ListNoChatItem(
                        navigateToProfileScreen = navigateToProfileScreen
                    )
                }

            }
        }
    }

}

@Composable
fun ListChatItem(
    navigateToProfileScreen: () -> Unit
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(LIST_ITEM_HEIGHT)
            .clickable{
                navigateToProfileScreen()
            },
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Row(
            horizontalArrangement = Arrangement.spacedBy(17.dp)
        ) {
            Profile(LIST_ITEM_HEIGHT)
            NameChat()
        }
        Column {
            TimeNotification(0)
        }
    }
}

@Composable
fun ListNoChatItem(
    navigateToProfileScreen: () -> Unit
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(LIST_ITEM_HEIGHT)
            .clickable{
                navigateToProfileScreen()
            },
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Row(
            horizontalArrangement = Arrangement.spacedBy(17.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Profile(LIST_ITEM_HEIGHT)
            NameNoChat()
        }
    }
}

@Composable
fun NameNoChat(){
    Text(
        text = "Saurab Gupta",
        style = MaterialTheme.typography.nameNoChat,
        color = MaterialTheme.colors.text
    )
}


@Composable
fun NameChat(){
    Column(
        modifier = Modifier
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier
                .padding(top = 9.dp),
            text = "Saurab Gupta",
            style = MaterialTheme.typography.name,
            color = MaterialTheme.colors.text
        )
        Text(
            modifier = Modifier
                .padding(bottom = 12.dp),
            text = "Hey Dude",
            style = MaterialTheme.typography.chatBlack,
            color = Color.Gray
        )
    }
}

@Composable
fun TimeNotification(notification: Int){
    Column(
        modifier = Modifier
            .height(63.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.End
    ) {
        Text(
            modifier = Modifier
                .padding(top = 12.dp),
            text = "10:00 AM",
            style = MaterialTheme.typography.listTime,
            color = MaterialTheme.colors.seenText
        )
        if(notification > 0){
            NotificationCircle(notification)
        }
    }
}

@Composable
fun NotificationCircle(notification: Int){
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colors.notification)
            .size(SCREEN_PADDING),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "$notification",
            style = MaterialTheme.typography.notification,
            color = MaterialTheme.colors.backgroundColor
        )
    }
}

@Preview
@Composable
fun ProfilePreview(){
    ChatAppTheme {
    }
}