package com.example.trabajo7k
import android.content.ClipData
import android.media.RouteListingPreference.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun MainScreen() {

 //lista de imagenes
    val listaimagenes = listOf(
        R.drawable.kot1,
        R.drawable.kot2,
        R.drawable.kot3,
        R.drawable.kot4,
        R.drawable.kot5
    )

    //declaracion variable
    var Imagin7 by remember { mutableStateOf(false) }

    // declaracion boton con 2 acciones
    val buttonText = if (Imagin7) "Ocultar imagen" else "Mostrar imagen"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        // texto de bienvenida
        Text(
            text = "¡Bienvenido!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        // texto2 del codigo
        Text(
            text = "Soraya Tapia",
            fontSize = 21.sp,
            fontWeight = FontWeight.Normal
        )


        // Boton del codigo
        Button(
            onClick = {
                Imagin7 = !Imagin7
            },
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Text(text = buttonText)
        }

        // se agrega la imagen aca
        if (Imagin7) {
            LazyColumn {
                items(listaimagenes) { imageRes ->
                    Image(
                        painter = painterResource(id = imageRes),
                        contentDescription = "Países Bajos",
                        modifier = Modifier
                            .size(400.dp)
                            .padding(vertical = 10.dp)
                            .fillMaxWidth()
                            .height(500.dp)
                    )
                }
            }
        }
    }
}