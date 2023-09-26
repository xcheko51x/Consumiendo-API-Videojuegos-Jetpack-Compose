package com.example.crud_retrofit_kotlin_compose_ejemplo.models

import com.google.gson.annotations.SerializedName

data class VideojuegoModel(
    @SerializedName("count")
    val total: Int,
    @SerializedName("results")
    val listaVideojuegos: List<VideoJuegosLista>
)

data class VideoJuegosLista(
    val id: Int,
    @SerializedName("name")
    val nombre: String,
    @SerializedName("background_image")
    val imagen: String
)
