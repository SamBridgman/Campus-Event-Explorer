package com.example.campuseventexplorer

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute

@Composable
fun AppNavHost(
    navController: NavHostController,
    events: List<CampusEvent>
) {

    NavHost(navController, startDestination = EventList) {
        composable<EventList> {
            EventScreen(
                events = events,
                onEventSelected = {
                    eventId -> navController.navigate(EventDetail(eventId))
                }
            )
        }
        composable<EventDetail> { entry ->
            val route = entry.toRoute<EventDetail>()
            val event = events.firstOrNull({ it.id == route.eventId})
            val context = LocalContext.current

            EventDetailScreen(
                event = event,
                onBack = navController::navigateUp,
                onShare = {
                    event?.let {
                        val intent = Intent(Intent.ACTION_SEND).apply {
                            type = "text/plain"
                            putExtra(
                                Intent.EXTRA_TEXT,
                                "${it.title} -- ${it.time} -- ${it.location}"
                            )
                        }
                        context.startActivity(
                            Intent.createChooser(intent, "Share event")
                        )
                    }
                }
            )
        }

    }

}