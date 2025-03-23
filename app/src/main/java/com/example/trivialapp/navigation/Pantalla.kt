package com.example.trivialapp.navigation
import kotlinx.serialization.Serializable

@Serializable
sealed class Pantalla(val route: String) {
    @Serializable
    object Pantalla1 : Pantalla("pantalla1")

    @Serializable
    object Pantalla2 : Pantalla("pantalla2")

    @Serializable
    data class Pantalla3(val dificultad: String) : Pantalla("pantalla3/$dificultad") {
        // Esta es la forma correcta de generar la ruta con un parámetro
        companion object {
            const val route = "pantalla3/{dificultad}"
            fun createRoute(dificultad: String) = "pantalla3/$dificultad"
        }
    }

    @Serializable
    object Pantalla4 : Pantalla("pantalla4")
}
