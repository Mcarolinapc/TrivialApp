package com.example.trivialapp.viewmodel


import android.os.CountDownTimer
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.trivialapp.model.Pregunta

/*class PreguntasViewModel(private val dificultad: String) : ViewModel() {


    // Variables de estado
    private var _preguntas = ProviderPreguntas().getPreguntasFaciles()
    private var _preguntaIndex = MutableLiveData<Int>(0)
    private val _preguntaActual = MutableLiveData<Pregunta>()
    val preguntaActual = _preguntaActual
    val NUM_PREGUNTAS =10

    private val _puntuacion = MutableLiveData<Int>(0)
    val puntuacion = _puntuacion

    private val _juegoTerminado = MutableLiveData<Boolean>(false)
    val juegoTerminado = _juegoTerminado

    private val _tiempoRestante = MutableLiveData(10) // 10 segundos por pregunta
    val tiempoRestante = _tiempoRestante

    private var countDownTimer: CountDownTimer? = null

    // Variables para mostrar respuesta correcta
    private val _respuestaCorrecta = MutableLiveData<String>()
    val respuestaCorrecta: LiveData<String> get() = _respuestaCorrecta

    private val _respuestaIncorrecta = MutableLiveData<Boolean>(false)
    val respuestaIncorrecta: LiveData<Boolean> get() = _respuestaIncorrecta

    init {
        when (dificultad) {
            "Facil" -> _preguntas = ProviderPreguntas().getPreguntasFaciles()
            "Media" -> _preguntas = ProviderPreguntas().getPreguntasMedias()
            "Experto" -> _preguntas = ProviderPreguntas().getPreguntasExperto()
        }
        _preguntaActual.value=_preguntas.get(_preguntaIndex.value!!)
        iniciarTemporizador()
    }

    fun validarRespuesta(respuestaEscogida: String) {
        countDownTimer?.cancel() // Cancelar el temporizador si el usuario responde

        if (respuestaEscogida == preguntaActual.value!!.respuestaCorrecta) {
            puntuacion.value = puntuacion.value!! + 1
            _respuestaIncorrecta.value = false
        }else {
            _respuestaCorrecta.value = preguntaActual.value!!.respuestaCorrecta
            _respuestaIncorrecta.value = true
        }

        siguientePregunta()
    }

    private fun siguientePregunta() {
        _preguntaIndex.value = _preguntaIndex.value!! + 1

        if (_preguntaIndex.value == NUM_PREGUNTAS) {
            _juegoTerminado.value = true
        } else {
            _preguntaActual.value = _preguntas[_preguntaIndex.value!!]
            _respuestaIncorrecta.value = false // Restablecer el estado de la respuesta incorrecta
            _respuestaCorrecta.value = "" // Limpiar la respuesta correcta
            iniciarTemporizador()
        }
    }

    private fun iniciarTemporizador() {
        _tiempoRestante.value = 10
        countDownTimer?.cancel() // Reiniciar si ya hay uno en marcha

        countDownTimer = object : CountDownTimer(10_000, 1_000) {
            override fun onTick(millisUntilFinished: Long) {
                _tiempoRestante.value = (millisUntilFinished / 1_000).toInt()
            }

            override fun onFinish() {
                siguientePregunta() // Si el tiempo se acaba, pasar a la siguiente pregunta
            }
        }.start()
    }

    override fun onCleared() {
        super.onCleared()
        countDownTimer?.cancel() // Limpiar el temporizador cuando el ViewModel se destruye
    }
}*/

class PreguntasViewModel(private val dificultad: String) : ViewModel() {

    // Variables de estado
    private var _preguntas = ProviderPreguntas().getPreguntasFaciles()
    private var _preguntaIndex = MutableLiveData<Int>(0)
    private val _preguntaActual = MutableLiveData<Pregunta>()
    val preguntaActual = _preguntaActual
    val NUM_PREGUNTAS = 10

    private val _puntuacion = MutableLiveData<Int>(0)
    val puntuacion = _puntuacion

    private val _juegoTerminado = MutableLiveData<Boolean>(false)
    val juegoTerminado = _juegoTerminado

    private val _tiempoRestante = MutableLiveData(10) // 10 segundos por pregunta
    val tiempoRestante = _tiempoRestante

    private var countDownTimer: CountDownTimer? = null

    // Variables para mostrar la respuesta correcta
    private val _respuestaCorrecta = MutableLiveData<String>()
    val respuestaCorrecta: LiveData<String> = _respuestaCorrecta

    private val _respuestaIncorrecta = MutableLiveData<Boolean>(false)
    val respuestaIncorrecta: LiveData<Boolean> = _respuestaIncorrecta

    init {
        when (dificultad) {
            "Facil" -> _preguntas = ProviderPreguntas().getPreguntasFaciles()
            "Media" -> _preguntas = ProviderPreguntas().getPreguntasMedias()
            "Experto" -> _preguntas = ProviderPreguntas().getPreguntasExperto()
        }
        _preguntaActual.value = _preguntas.get(_preguntaIndex.value!!)
        iniciarTemporizador()
    }

    fun validarRespuesta(respuestaEscogida: String) {
        countDownTimer?.cancel() // Cancelar el temporizador si el usuario responde

        // Verificar si la respuesta es incorrecta
        if (respuestaEscogida != preguntaActual.value?.respuestaCorrecta) {
            _respuestaCorrecta.value = preguntaActual.value?.respuestaCorrecta ?: ""
            _respuestaIncorrecta.value = true
        } else {
            _respuestaIncorrecta.value = false
            puntuacion.value = puntuacion.value!! + 1
        }

        siguientePregunta()
    }

    private fun siguientePregunta() {
        _preguntaIndex.value = _preguntaIndex.value!! + 1

        if (_preguntaIndex.value == NUM_PREGUNTAS) {
            _juegoTerminado.value = true
        } else {
            _preguntaActual.value = _preguntas[_preguntaIndex.value!!]
            iniciarTemporizador()
        }
    }

    private fun iniciarTemporizador() {
        _tiempoRestante.value = 10
        countDownTimer?.cancel() // Reiniciar si ya hay uno en marcha

        countDownTimer = object : CountDownTimer(10_000, 1_000) {
            override fun onTick(millisUntilFinished: Long) {
                _tiempoRestante.value = (millisUntilFinished / 1_000).toInt()
            }

            override fun onFinish() {
                siguientePregunta() // Si el tiempo se acaba, pasar a la siguiente pregunta
            }
        }.start()
    }

    override fun onCleared() {
        super.onCleared()
        countDownTimer?.cancel() // Limpiar el temporizador cuando el ViewModel se destruye
    }
}
