package com.example.campuseventexplorer

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute

/** Slide 18 navigation graph. */
//@Composable
//fun AppNavHost(
//    navController: NavHostController,
//    topics: List<StudyTopic>,
//) {
//    NavHost(navController, startDestination = Planner) {
//        composable<Planner> {
//            PlannerScreen(
//                topics = topics,
//                onTopicSelected = { topicId ->
//                    navController.navigate(TopicDetail(topicId))
//                },
//            )
//        }
//        composable<TopicDetail> { entry ->
//            val route = entry.toRoute<TopicDetail>()
//            TopicDetailScreen(
//                topic = topics.firstOrNull { it.id == route.topicId },
//                onBack = navController::navigateUp,
//            )
//        }
//    }
//}
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
            EventDetailScreen(
                eventId = event?.id,
                onBack = navController::navigateUp,
            )
        }

    }

}