package com.example.trivialapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trivialapp.screens.Game
import com.example.trivialapp.screens.MyDropDownmenuDificultad
import com.example.trivialapp.screens.Resultado
import com.example.trivialapp.screens.SplashScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Pantalla.Pantalla1.route) {
        composable(Pantalla.Pantalla1.route) {
            SplashScreen(navController = navController)
        }

        composable(Pantalla.Pantalla2.route) {
            MyDropDownmenuDificultad(navController = navController)
        }

        // Se recibe la dificultad desde los argumentos de la ruta
        composable("pantalla3/{dificultad}") { backStackEntry ->
            val dificultad = backStackEntry.arguments?.getString("dificultad") ?: "facil"
            Game(navController = navController, dificultad = dificultad)
        }

        composable("pantalla4") {
            Resultado(navController = navController)
        }
    }
}
