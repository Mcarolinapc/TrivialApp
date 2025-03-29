package com.example.trivialapp.screens

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.trivialapp.R
@Composable
fun Resultado(resultado: String, navigateToNext: () -> Unit) {
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Imagen de fondo
        Image(
            painter = painterResource(id = R.drawable.ganador),
            contentDescription = "Fondo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        // Imagen centrada en la parte superior
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Imagen Superior Centrada",
            modifier = Modifier.size(300.dp).align(Alignment.TopCenter)
        )

        Column(
            modifier = Modifier.fillMaxSize().padding(bottom = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Tu Puntuación: $resultado",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Mensaje según la puntuación
            Text(
                text = if (resultado.toInt() > 5) "¡Nuestros cocineros aprueban tus conocimientos!" else "Vayase sr programador ,VAYASÉ",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(50.dp))

            // Botón para compartir la puntuación
            Share("Mi puntuación en PeppeRush ha sido $resultado", context)

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { navigateToNext() },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
            ) {
                Text("Volver al menú", color = Color.Red)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { (context as? Activity)?.finish() },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
                Text("Salir del Juego", color = Color.Yellow)
            }
        }

        // Anuncio fijo en la parte inferior
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color.LightGray)
                .padding(10.dp)
                .clickable {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/naturaallovee?igsh=amllbjFya3JmYzU2"))
                    context.startActivity(intent)
                }
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.naturalove),
                    contentDescription = "Patrocinador",
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Esta app la patrocina Naturalove\nClica y maravíllate con sus productos\nby Mich",
                    color = Color.DarkGray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.ExtraLight
                )
            }
        }
    }
}
@Composable
fun Share(text: String, context: Context) {
    val sendIntent = Intent(Intent.ACTION_SEND).apply {
        putExtra(Intent.EXTRA_TEXT, text)
        type = "text/plain"
    }
    val shareIntent = Intent.createChooser(sendIntent, null)
    Button(
        onClick = { startActivity(context, shareIntent, null) },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Yellow // Cambia el color de fondo del botón
        ),
        modifier = Modifier.padding(8.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Share,
            contentDescription = null,
            tint = Color.Red // Cambia el color del ícono
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "Comparte",
            color = Color.Green // Cambia el color del texto
        )
    }
}
