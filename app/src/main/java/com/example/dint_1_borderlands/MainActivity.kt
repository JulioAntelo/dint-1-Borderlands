package com.example.dint_1_borderlands

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dint_1_borderlands.Model.Routes
import com.example.dint_1_borderlands.Screens.PantallaInicio
import com.example.dint_1_borderlands.Screens.PantallaRegistrarse
import com.example.dint_1_borderlands.ui.theme.Dint1BorderlandsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dint1BorderlandsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = rememberNavController(),
                        startDestination = Routes.PantallaInicio.route
                    ) {
                        composable(Routes.PantallaInicio.route) { PantallaInicio(navController) }
                        composable(Routes.PantallaRegistrarse.route) { PantallaRegistrarse(navController) }
                    }
                }
            }
        }
    }
}


