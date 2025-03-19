package com.example.trivialapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        )
    {
        Image(
            painter = painterResource(id = R.drawable.logoapp),
            contentDescription = "logoAppTrivial",
            modifier = Modifier.fillMaxSize(0.9F),
            contentScale = ContentScale.Fit // pa que no se me deforme la imagen
        )
        /*Text(
            "Bienvenidos al Trivial",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraLight,
            color = Color.Red
        )*/

    }
}