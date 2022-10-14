package com.example.chatapp.ui.screen.profile

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chatapp.components.Profile
import com.example.chatapp.ui.theme.*

@Composable
fun ProfileContent(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(SCREEN_PADDING, 0.dp)
    ) {
        Spacer(modifier = Modifier.height(TOP_CONTENT_PADDING))
        Profile(175.dp)
        Spacer(modifier = Modifier.height(47.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(PROFILE_SPACE)
        ){
            NameRow()
            BirthdayRow()
            GenderRow()
            EmailRow()
            PhoneRow()
        }
    }
}

@Composable
fun NameRow(){
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Name",
            style = MaterialTheme.typography.name,
            color = MaterialTheme.colors.text
        )
        Text(
            text = "Saurab Gupta",
            style = MaterialTheme.typography.nameInformation,
            color = MaterialTheme.colors.text
        )
    }
}

@Composable
fun BirthdayRow(){
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Birthday",
            style = MaterialTheme.typography.name,
            color = MaterialTheme.colors.text
        )
        Text(
            text = "01/01/2000",
            style = MaterialTheme.typography.nameInformation,
            color = MaterialTheme.colors.text
        )
    }
}

@Composable
fun GenderRow(){
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Gender",
            style = MaterialTheme.typography.name,
            color = MaterialTheme.colors.text
        )
        Text(
            text = "Male",
            style = MaterialTheme.typography.nameInformation,
            color = MaterialTheme.colors.text
        )
    }
}

@Composable
fun EmailRow(){
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Email",
            style = MaterialTheme.typography.name,
            color = MaterialTheme.colors.text
        )
        Text(
            text = "sarab_hero@gmail.com",
            style = MaterialTheme.typography.nameInformation,
            color = MaterialTheme.colors.text
        )
    }
}

@Composable
fun PhoneRow(){
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Phone",
            style = MaterialTheme.typography.name,
            color = MaterialTheme.colors.text
        )
        Text(
            text = "+91-985-559-7058",
            style = MaterialTheme.typography.nameInformation,
            color = MaterialTheme.colors.text
        )
    }
}

@Preview
@Composable
fun ProfileContentPreview(){
    ChatAppTheme { ProfileContent() }
}