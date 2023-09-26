package com.example.crud_retrofit_kotlin_compose_ejemplo.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.crud_retrofit_kotlin_compose_ejemplo.models.VideoJuegosLista
import com.example.crud_retrofit_kotlin_compose_ejemplo.network.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class VideojuegosViewModel: ViewModel() {

    private val _juegos = MutableStateFlow<List<VideoJuegosLista>>(emptyList())
    val juegos = _juegos.asStateFlow()

    init {
        obtenerJuegos()
    }

    private fun obtenerJuegos() {
        viewModelScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.Main) {
                val response = RetrofitClient.retrofit.obtenerJuegos()
                _juegos.value = response.body()?.listaVideojuegos ?: emptyList()
                Log.d("API", _juegos.value.toString())
            }
        }
    }
}