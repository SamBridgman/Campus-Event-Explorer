package com.example.campuseventexplorer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.campuseventexplorer.ui.theme.CampusEventExplorerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CampusEventExplorerTheme {
                CampusEventExplorerApp()
            }
        }
    }
}

@Composable
fun CampusEventExplorerApp() {
    val navController = rememberNavController()
    AppNavHost(
        navController = navController,
        events = sampleEvents
    )
}