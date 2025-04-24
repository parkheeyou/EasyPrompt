package com.hugh_paak.easy_prompt

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost (
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(Screen.Splash.route) {
            // SplashScreen(navController)
        }

        composable(Screen.Home.route) {
            // HomeScreen(navController)
        }

        composable(Screen.PromptInput.route) {
            // PromptInput(navController)
        }

        composable(Screen.PromptResult.route) {
            // PrompteResult(navController)
        }

        composable(Screen.Settings.route) {
            // Settings(navController)
        }
    }
}