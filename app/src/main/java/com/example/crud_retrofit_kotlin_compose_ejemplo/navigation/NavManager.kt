package com.example.crud_retrofit_kotlin_compose_ejemplo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.crud_retrofit_kotlin_compose_ejemplo.viewmodels.VideojuegosViewModel
import com.example.crud_retrofit_kotlin_compose_ejemplo.views.InicioView

@Composable
fun NavManager(viewModel: VideojuegosViewModel) {

    val navController = rememberNavController()

    NavHost(
        navController = navController
        , startDestination = "inicio"
    ) {
        composable("inicio") {
            InicioView(navController, viewModel)
        }
    }
}