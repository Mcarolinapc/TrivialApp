package com.example.trivialapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.trivialapp.R
import com.example.trivialapp.navigation.AppScreen
import kotlinx.coroutines.delay

@Composable

fun SplashScreen(navController: NavHostController) {
    LaunchedEffect(key1=true) { delay(3000)
        navController.popBackStack()
        navController.navigate(AppScreen.MainScreen.route)
    }

    Splash()
}

@Composable

fun Splash() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Imagen de fondo desenfocada
        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .matchParentSize()
                .graphicsLayer {
                    renderEffect = BlurEffect(20f, 20f) // Ajusta el desenfoque
                }
        )

        // Logo centrado encima del fondo
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .align(Alignment.Center)
                .size(500.dp) // Ajusta el tamaño del logo
        )
    }
}