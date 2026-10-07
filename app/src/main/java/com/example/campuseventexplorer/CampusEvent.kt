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
    CampusEvent(id = 1, title = "Event 1", category = "Physics", location = "CDS", time = "7pm", description = "Test Desc"),
    CampusEvent(id = 2, title = "Event 2", category = "CS", location = "CDS", time = "2pm", description = "Test Desc"),
    CampusEvent(id = 3, title = "Event 3", category = "English", location = "CDS", time = "3pm", description = "Test Desc"),
    CampusEvent(id = 4, title = "Event 4", category = "Fitness", location = "CDS", time = "9pm", description = "Test Desc"),
    CampusEvent(id = 5, title = "Event 5", category = "Gaming", location = "CDS", time = "1pm", description = "Test Desc"),
    CampusEvent(id = 6, title = "Event 6", category = "Networking", location = "CDS", time = "12pm", description = "Test Desc"),
    CampusEvent(id = 7, title = "Event 7", category = "Jobs", location = "CDS", time = "11am", description = "Test Desc"),
    CampusEvent(id = 8, title = "Event 8", category = "Rock CLimbing", location = "CDS", time = "7am", description = "Test Desc"),
)