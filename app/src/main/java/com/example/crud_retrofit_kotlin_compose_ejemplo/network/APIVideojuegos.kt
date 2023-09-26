package com.example.crud_retrofit_kotlin_compose_ejemplo.network

import com.example.crud_retrofit_kotlin_compose_ejemplo.models.VideojuegoModel
import com.example.crud_retrofit_kotlin_compose_ejemplo.utils.Constantes
import retrofit2.Response
import retrofit2.http.GET

interface APIVideojuegos {

    @GET("games${Constantes.API_KEY}")
    suspend fun obtenerJuegos(): Response<VideojuegoModel>
}