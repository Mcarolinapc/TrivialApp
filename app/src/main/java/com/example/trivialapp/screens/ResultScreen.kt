package com.example.trivialapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp.navigation.Pantalla

@Composable
fun Resultado(navController: NavController) {
    // Aquí solo mostramos un texto y un botón para navegar atrás
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "tú Puntuacion",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {}) {
            Text("Share")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                // Vuelve a la pantalla anterior (Pantalla2) usando popBackStack()
                navController.popBackStack(Pantalla.Pantalla2.route, false)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Volver a Pantalla 2")
        }
    }
}
