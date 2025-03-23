package com.example.trivialapp.viewmodel


import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.trivialapp.model.Pregunta
import com.example.trivialapp.model.Respuesta

class PreguntasView (private val dificultad :String): ViewModel(){

    private val pregunta= Pregunta()

    private val preguntActual = mutableStateOf(pregunta.getPreguntaAleatoria(dificultad))
    val preguntaActual :State<Respuesta> = preguntActual

    fun cambiarPregunta() {
        preguntActual.value = pregunta.getPreguntaAleatoria(dificultad)
    }

}