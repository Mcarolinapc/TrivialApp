package com.example.trivialapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.trivialapp.R

/*@Composable
fun MainScreen(navController: NavHostController){
    Column(Modifier.fillMaxSize(),Arrangement.Center,Alignment.CenterHorizontally) {
        Text("pantallaPrincipal")


    }
}*/



@Composable
fun myDropDownmenuDificultad(navController: NavHostController){
    var selectedText: String by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val dificultades= listOf("Facil","Media","Experto")

    val eleccion :String by remember { mutableStateOf("") }

    var showText: Boolean by remember { mutableStateOf(false) }
    Column(
        Modifier.fillMaxSize().background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center




    ) {
        Image(
            painter = painterResource(id = R.drawable.chefita),
    contentDescription = "Fondo",
            modifier = Modifier.size(500.dp),
            contentScale = ContentScale.Fit
)
        Text(
            "Dificultad",
            color = Color.Yellow,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            textAlign = TextAlign.Center
        )
        OutlinedTextField(
            value = selectedText,
            onValueChange = { selectedText = it },
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expanded = true }
                .fillMaxWidth().background(Color.DarkGray)
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            dificultades.forEach { opcion ->
                DropdownMenuItem(text = { Text(opcion)}, onClick = {
                    expanded = false
                    selectedText = opcion.trim()
                })

            }
        }
    }

}

