package com.example.trivialapp.navigation

import android.window.SplashScreen

sealed class AppScreen(val route:String){
    object Splashscreen: AppScreen("splash_screen")
    object MainScreen : AppScreen("main_screen")
}