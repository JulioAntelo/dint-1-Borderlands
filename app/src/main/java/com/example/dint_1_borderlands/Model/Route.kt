package com.example.dint_1_borderlands.Model

sealed class Routes(val route:String) {
    object PantallaInicio : Routes("PantallaInicio")

    object PantallaRegistrarse : Routes("PantallaRegistrarse")

}