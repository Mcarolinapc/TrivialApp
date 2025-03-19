package com.example.trivialapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trivialapp.ui.MainScreen
import com.example.trivialapp.ui.SplashScreen

@Composable
fun AppNavigation (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.Splashscreen.route){
        composable(AppScreen.Splashscreen.route){
            SplashScreen(navController)
        }
        composable (AppScreen.MainScreen.route){
            MainScreen(navController)
        }

    }
}