package com.example.campuseventexplorer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class EventText {
    TITLE, DESC, LOCATION, TIME, CATEGORY
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventScreen(
    events: List<CampusEvent>
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Study Planner") },
            )
        },
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

            items(events, key= { it.id }) {
                EventCard(it)
            }

        }
    }
}

@Composable
fun EventCard(event: CampusEvent, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp).background(Color.LightGray, shape = RoundedCornerShape(16.dp)).padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),

    )  {
        EventScreenText(EventText.TITLE, event.title)
        EventScreenText(EventText.LOCATION, event.location)
        EventScreenText(EventText.CATEGORY,event.category)
        EventScreenText(EventText.TIME ,event.time)

    }
}



@Composable
fun EventScreenText(type: EventText, text: String) {

    when (type) {
        EventText.TITLE -> {
            Text(text, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
        EventText.TIME -> {
            Text(text, fontSize = 12.sp, color = Color.Blue)
        }
        EventText.LOCATION, EventText.CATEGORY , EventText.DESC-> {
            Text(text, fontSize = 12.sp)
        }
    }

}