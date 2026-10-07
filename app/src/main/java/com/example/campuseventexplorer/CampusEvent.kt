package com.example.campuseventexplorer

data class CampusEvent (
    val id: Long,
    val title: String,
    val category: String,
    val location: String,
    val time: String,
    val description: String
)

val sampleEvents = listOf(
    CampusEvent(id = 1, title = "Physics 101", category = "Physics", location = "CDS", time = "7pm", description = "Test Desc"),
    CampusEvent(id = 2, title = "CS meetup", category = "CS", location = "CDS", time = "2pm", description = "Test Desc"),
    CampusEvent(id = 3, title = "English read", category = "English", location = "CDS", time = "3pm", description = "Test Desc"),
    CampusEvent(id = 4, title = "Gym Hangout", category = "Fitness", location = "CDS", time = "9pm", description = "Test Desc"),
    CampusEvent(id = 5, title = "Game with friends", category = "Gaming", location = "CDS", time = "1pm", description = "Test Desc"),
    CampusEvent(id = 6, title = "Networking event at microsoft", category = "Networking", location = "CDS", time = "12pm", description = "Test Desc"),
    CampusEvent(id = 7, title = "Get a job", category = "Jobs", location = "CDS", time = "11am", description = "Test Desc"),
    CampusEvent(id = 8, title = "Rock climbing event", category = "Rock Climbing", location = "CDS", time = "7am", description = "Test Desc"),
)