package com.example.crud_retrofit_kotlin_compose_ejemplo.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.crud_retrofit_kotlin_compose_ejemplo.components.CardJuego
import com.example.crud_retrofit_kotlin_compose_ejemplo.components.MainTopBar
import com.example.crud_retrofit_kotlin_compose_ejemplo.utils.Constantes
import com.example.crud_retrofit_kotlin_compose_ejemplo.viewmodels.VideojuegosViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InicioView(navController: NavController, viewModel: VideojuegosViewModel) {
    Scaffold(
        topBar = {
            MainTopBar(titulo = "API JUEGOS")
        }
    ) {
        ContenidoIncioView(
            navController = navController,
            viewModel = viewModel,
            pad = it
        )
    }
}

@Composable
fun ContenidoIncioView(navController: NavController, viewModel: VideojuegosViewModel, pad: PaddingValues) {
    val juegos by viewModel.juegos.collectAsState()

    LazyColumn(
        modifier = Modifier
            .padding(pad)
            .background(Color(Constantes.COLOR_ROJO))
    ) {
        items(juegos) {
            CardJuego(juego = it) {

            }
            Text(
                text = it.nombre,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 12.dp)
            )
        }
    }
}