package com.example.crud_retrofit_kotlin_compose_ejemplo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.crud_retrofit_kotlin_compose_ejemplo.models.VideoJuegosLista
import com.example.crud_retrofit_kotlin_compose_ejemplo.utils.Constantes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(
    titulo: String
) {
    TopAppBar(
        title = {
            Text(
                text = titulo,
                color= Color.White,
                fontWeight = FontWeight.ExtraBold
            )
        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color(Constantes.COLOR_NEGRO_PERSONALIZADO)
        )
    )
}

@Composable
fun CardJuego(juego: VideoJuegosLista, onClick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier
            .padding(8.dp)
            .shadow(40.dp)
            .clickable { onClick() }
    ) {
        Column {
            InicioImagen(imagen = juego.imagen)
        }
    }
}

@Composable
fun InicioImagen(imagen: String) {
    val imagen = rememberImagePainter(data = imagen)
    
    Image(
        painter = imagen,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
    )
}