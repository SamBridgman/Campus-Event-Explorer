package com.example.campuseventexplorer

import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_SEND
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventDetailScreen(
    event: CampusEvent?,
    onBack: () -> Unit,
    onShare: () -> Unit
) {

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Event Details") },
                navigationIcon = {
                    TextButton(onClick = onBack) {
                        Text("Back")
                    }
                },
                )


        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            if (event != null) {
                EventDetailScreenText(EventText.TITLE, event.title)
                EventDetailScreenText(EventText.CATEGORY, event.category)
                EventDetailScreenText(EventText.LOCATION, event.location)
                EventDetailScreenText(EventText.TIME, event.time)
                EventDetailScreenText(EventText.DESC, event.description)


                Button(onClick = onShare) {
                    Text("Share Event")
                }

            } else {
                Text("Event not found")
                Button(
                    onClick = onBack
                ) {
                    Text("Return to Events")
                }
            }



        }
    }
}

@Composable
fun EventDetailScreenText(type: EventText, text: String) {
    when (type) {
        EventText.TITLE -> Text(text, fontSize = 28.sp, fontWeight = FontWeight.Bold)
        EventText.CATEGORY -> Text(text, fontSize = 14.sp, color = Color.Gray)
        EventText.TIME -> Text(text, fontSize = 18.sp, color = Color.Blue)
        EventText.LOCATION -> Text(text, fontSize = 16.sp)
        EventText.DESC -> Text(text, fontSize = 16.sp)
    }
}
