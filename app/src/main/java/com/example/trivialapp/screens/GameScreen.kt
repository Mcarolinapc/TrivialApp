package com.example.trivialapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.trivialapp.R
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

        Image(
            painter = painterResource(id = R.drawable.fondogamescreen), // Reemplaza con tu imagen
            contentDescription = "Fondo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier = Modifier
                //.background() ponerle el fondo
                .align(Alignment.Center)
                .padding(16.dp)
        ) {

            TimerDisplay(viewModel)

            Spacer(modifier = Modifier.height(8.dp))

            Text("Acertadas $puntaje", color = Color.Yellow)
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = pregunta?.pregunta ?: "",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp),
                color = Color.Yellow
            )

            // Botones de respuesta
            listOf(
                pregunta?.respuesta1,
                pregunta?.respuesta2,
                pregunta?.respuesta3,
                pregunta?.respuesta4
            ).forEach { respuesta ->
                Button(
                    onClick = { respuesta?.let { viewModel.validarRespuesta(it) } },
                    modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
                ) {
                    Text(respuesta ?: "")
                }
            }
        }
    }

}

@Composable
fun TimerDisplay(viewModel: PreguntasViewModel) {
    val tiempoRestante by viewModel.tiempoRestante.observeAsState(10)

    Text(
        text = "Tiempo restante: $tiempoRestante s",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = if (tiempoRestante <= 3) Color.Red else Color.Black
    )
}