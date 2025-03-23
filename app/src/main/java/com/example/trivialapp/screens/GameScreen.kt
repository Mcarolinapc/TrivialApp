package com.example.trivialapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.trivialapp.PreguntasViewModelFactory
import com.example.trivialapp.navigation.Pantalla
import com.example.trivialapp.viewmodel.PreguntasView


@Composable
fun Game(navController: NavController, dificultad: String) {
    val viewModel: PreguntasView = viewModel(
        factory = PreguntasViewModelFactory(dificultad)
    )
    val pregunta = viewModel.preguntaActual.value
    Box(
        modifier = Modifier.fillMaxSize() // Asegura que el Box ocupe toda la pantalla
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center) // Centra las preguntas y respuestas
                .padding(16.dp)
        ) {

            Text(text = pregunta.pregunta)

            // Aquí mostraríamos las respuestas como botones
            Button(onClick = { /* Acción de respuesta correcta */ }) {
                Text(pregunta.respuesta1)
            }
            Button(onClick = { /* Acción de respuesta incorrecta */ }) {
                Text(pregunta.respuesta2)
            }
            Button(onClick = { /* Acción de respuesta incorrecta */ }) {
                Text(pregunta.respuesta3)
            }
            Button(onClick = { /* Acción de respuesta incorrecta */ }) {
                Text(pregunta.respuesta4)
            }
        }
    }

    // Coloca el botón en la parte inferior
    Button(
        onClick = {
            navController.navigate(Pantalla.Pantalla4.route)
        },
        modifier = Modifier  // Esto alinea el botón en la parte inferior
            .fillMaxWidth()
            .padding(16.dp)  // Agrega un poco de padding para que no quede pegado a los bordes
    ) {
        Text("Resultado")
    }
}
