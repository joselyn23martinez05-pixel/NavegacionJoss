// IA generated: Corrected package and imports to match project structure
package com.example.navegacionjoss.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navegacionjoss.screens.DetailScreen
import com.example.navegacionjoss.screens.HomeScreen

/**
 * IA generated: Definición de las rutas de navegación.
 */
sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Detail : Screen("detail")
}

/**
 * IA generated: Grafo de navegación de la aplicación.
 */
@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToDetail = {
                    navController.navigate(Screen.Detail.route)
                }
            )
        }
        composable(Screen.Detail.route) {
            DetailScreen(
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}
