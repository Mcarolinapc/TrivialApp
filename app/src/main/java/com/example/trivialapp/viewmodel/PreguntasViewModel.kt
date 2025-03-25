package com.example.trivialapp.viewmodel


import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.trivialapp.model.Pregunta

class PreguntasViewModel(private val dificultad: String) : ViewModel() {


    // Variables de estado
    private var _preguntas = ProviderPreguntas().getPreguntasFaciles()
    private var _preguntaIndex = MutableLiveData<Int>(0)
    private val _preguntaActual = MutableLiveData<Pregunta>(_preguntas.get(_preguntaIndex.value!!))
    val preguntaActual = _preguntaActual
    val NUM_PREGUNTAS =10

    private val _puntuacion = MutableLiveData<Int>(0)
    val puntuacion = _puntuacion

    private val _juegoTerminado = MutableLiveData<Boolean>(false)
    val juegoTerminado = _juegoTerminado

    init {
        when (dificultad) {
            "Facil" -> _preguntas = ProviderPreguntas().getPreguntasFaciles()
            "Media" -> _preguntas = ProviderPreguntas().getPreguntasMedias()
            "Experto" -> _preguntas = ProviderPreguntas().getPreguntasFaciles()
        }
    }

    fun validarRespuesta(respuestaEscogida:String) {

        if(respuestaEscogida== preguntaActual.value!!.respuestaCorrecta){
            puntuacion.value=puntuacion.value!!.plus(1)
        }
        _preguntaIndex.value = _preguntaIndex.value!!.plus(1)

        if(_preguntaIndex.value == NUM_PREGUNTAS){
            _juegoTerminado.value=true
        }else {

            _preguntaActual.value = _preguntas.get(_preguntaIndex.value!!)
        }

    }
}
