package com.example.dint_1_borderlands.Screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.dint_1_borderlands.Model.Routes
import com.example.dint_1_borderlands.pginadeinicioborderlands.PGinaDeInicioBorderlands
import com.example.dint_1_borderlands.piedeapp.MaterialSymbolsPersonOutline


@Composable
fun PantallaInicio(navController: NavHostController) {
    PGinaDeInicioBorderlands(
        MaterialSymbolsPersonOutline(perfilTap = { navController.navigate(Routes.PantallaRegistrarse.route)}))
}