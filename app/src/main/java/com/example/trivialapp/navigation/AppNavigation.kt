package com.example.trivialapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.trivialapp.screens.Game
import com.example.trivialapp.screens.MyDropDownmenuDificultad
import com.example.trivialapp.screens.Resultado


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, Pantalla1) {
        composable<Pantalla1> {
            MyDropDownmenuDificultad { dificultad -> navController.navigate(Pantalla2(dificultad)) }
        }
        composable<Pantalla2> { backStackEntry ->
            // Recupera el argumento dificultad de la ruta usando 'backStackEntry'
            val dificultad = backStackEntry.arguments?.getString("dificultad") ?: "Facil"

            // Llamamos a la pantalla Game con el argumento dificultad
            Game(dificultad) { resultado ->
                // Después de obtener el resultado, puedes navegar o hacer lo que necesites
                //navController.navigate("Pantalla3/$resultado")
                navController.navigate(Pantalla3(resultado))
            }
        }

        composable<Pantalla3> { backStackEntry ->
            val pantalla3 = backStackEntry.toRoute<Pantalla3>()
            Resultado(pantalla3.resultado) { navController.navigate(Pantalla1) {
                popUpTo<Pantalla1> { inclusive = true } } }
        }
    }
}






