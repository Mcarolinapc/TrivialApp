package com.example.trivialapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.trivialapp.R
import com.example.trivialapp.viewmodel.PreguntasViewModelFactory
import com.example.trivialapp.viewmodel.PreguntasViewModel

@Composable
fun Game(dificultad: String, navigateToNext: (String) -> Unit) {
    val viewModel: PreguntasViewModel = viewModel(factory = PreguntasViewModelFactory(dificultad))
    val pregunta by viewModel.preguntaActual.observeAsState()
    val puntaje by viewModel.puntuacion.observeAsState(0)
    val juegoTerminado by viewModel.juegoTerminado.observeAsState(false)
    val respuestaCorrecta by viewModel.respuestaCorrecta.observeAsState("")
    val respuestaIncorrecta by viewModel.respuestaIncorrecta.observeAsState(false)

    if (juegoTerminado) {
        navigateToNext(puntaje.toString())
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.fondogamescreen), // Reemplaza con tu imagen
            contentDescription = "Fondo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        // Imagen centrada en la parte superior
        Image(
            painter = painterResource(id = R.drawable.logo), // Reemplaza con el nombre de tu recurso
            contentDescription = "Imagen Superior Centrada",
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.TopCenter)
        )


        Column(
            modifier = Modifier.align(Alignment.Center).padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TimerDisplay(viewModel)

            Spacer(modifier = Modifier.height(50.dp))

            Text("Acertadas $puntaje", color = Color.Yellow)

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = pregunta?.pregunta ?: "",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 10.dp),
                color = Color.Yellow
            )

            Spacer(modifier = Modifier.height(25.dp))

            val buttonColors = listOf(Color(0xFFFFA500), Color(0xFFFFFF00), Color(0xFF00FF00))

            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                (0..1).forEach { row ->
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        (0..1).forEach { col ->
                            val index = row * 2 + col
                            val respuesta = listOf(
                                pregunta?.respuesta1,
                                pregunta?.respuesta2,
                                pregunta?.respuesta3,
                                pregunta?.respuesta4
                            )[index]
                            Button(
                                onClick = { respuesta?.let { viewModel.validarRespuesta(it) } },
                                modifier = Modifier.weight(1f).padding(4.dp),
                                colors = androidx.compose.material3.ButtonDefaults.buttonColors(buttonColors[index % buttonColors.size])
                            ) {
                                Text(respuesta ?: "")
                            }
                        }
                    }
                }
            }

            // Mostrar la respuesta correcta solo si la respuesta es incorrecta
            if (respuestaIncorrecta) {
                Spacer(modifier = Modifier.height(100.dp))

                Text(
                    text = "Respuesta correcta de la pregunta anterior: $respuestaCorrecta",
                    color = Color.Yellow, // Color del texto
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .background(Color.DarkGray) // Fondo del texto
                        .padding(8.dp) // Espaciado alrededor del texto para que no quede pegado al fondo
                        .fillMaxWidth()
                )
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
        color = if (tiempoRestante <= 3) Color.Red else Color.Green,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}