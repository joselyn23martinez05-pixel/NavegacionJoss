// IA generated: Package corrected to match project structure
package com.example.navegacionjoss.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.navegacionjoss.R

/**
 * IA generated: Pantalla principal de la aplicación.
 * Muestra un título, una imagen de recursos, descripción y un botón para navegar al detalle.
 */
@Composable
fun HomeScreen(
    onNavigateToDetail: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Interestelar",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        // IA generated: Muestra una imagen desde la carpeta res/drawable (ic_launcher_foreground)
// Muestra una imagen desde la carpeta res/drawable (interestelar)
        Image(
            painter = painterResource(id = R.drawable.Interestelar),
            contentDescription = "Imagen Interestelar",
            modifier = Modifier.size(120.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Esta es una aplicación de ejemplo para demostrar Navigation Compose en Android.",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = onNavigateToDetail) {
            Text(text = "Ir a detalle")
        }
    }
}
