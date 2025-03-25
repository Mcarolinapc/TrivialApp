package com.example.trivialapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.trivialapp.viewmodel.PreguntasViewModelFactory
import com.example.trivialapp.viewmodel.PreguntasViewModel


@Composable
fun Game(dificultad: String, navigateToNext: (String) -> Unit) {
    val viewModel: PreguntasViewModel = viewModel(factory = PreguntasViewModelFactory(dificultad))
    val pregunta by viewModel.preguntaActual.observeAsState()
    val puntaje by viewModel.puntuacion.observeAsState(0)
    val juegoTerminado by viewModel.juegoTerminado.observeAsState(false)

    if(juegoTerminado){
        navigateToNext (puntaje.toString())
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp)
        ) {
            Text("llevas $puntaje" , color = Color.Yellow)
            Text(
                text = pregunta?.pregunta ?: "",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp),
                color = Color.Yellow

            )

            // Botones de respuesta
            Button(onClick = {
                viewModel.validarRespuesta(pregunta!!.respuesta1)
                //viewModel.cargarPregunta()
            }) { Text(pregunta?.respuesta1 ?: "") }

            Button(onClick = {
                viewModel.validarRespuesta(pregunta!!.respuesta2)
                //viewModel.cargarPregunta()
            }) { Text(pregunta?.respuesta2 ?: "") }

            Button(onClick = {
                viewModel.validarRespuesta(pregunta!!.respuesta3)
            }) { Text(pregunta?.respuesta3 ?: "") }

            Button(onClick = {
                viewModel.validarRespuesta(pregunta!!.respuesta4)
            }) { Text(pregunta?.respuesta4 ?: "") }
        }
    }

    // Botón para finalizar el juego y enviar solo el resultado
}