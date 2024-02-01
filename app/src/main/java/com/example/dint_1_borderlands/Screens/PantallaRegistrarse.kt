package com.example.dint_1_borderlands.Screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.dint_1_borderlands.Model.Routes
import com.example.dint_1_borderlands.meniniciosesinusuarioborderlands.MenInicioSesiNUsuarioBorderlands
import com.example.dint_1_borderlands.piedeapp.PhHouse

@Composable
fun PantallaRegistrarse(navController: NavHostController) {
    MenInicioSesiNUsuarioBorderlands(
        PhHouse(paginaInicialTap = { navController.navigate(Routes.PantallaInicio.route) }) {
        }
    )
}