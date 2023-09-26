package com.example.crud_retrofit_kotlin_compose_ejemplo.network

import com.example.crud_retrofit_kotlin_compose_ejemplo.utils.Constantes
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    val retrofit: APIVideojuegos by lazy {
        Retrofit
            .Builder()
            .baseUrl(Constantes.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIVideojuegos::class.java)
    }
}