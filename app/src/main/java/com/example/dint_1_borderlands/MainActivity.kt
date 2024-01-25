package com.example.dint_1_borderlands

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dint_1_borderlands.buildsdelacomunidad.BuildsDeLaComunidad
import com.example.dint_1_borderlands.cabecerapaginainicial.CabeceraPaginaInicial
import com.example.dint_1_borderlands.piedeapp.PieDeApp
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
                    PaginaInicial()
                }
            }
        }
    }
}



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun PaginaInicial(

){

    Scaffold(
        topBar = { CabeceraPaginaInicial(
            Modifier
                .size(450.dp, 95.dp)
        ) },
        bottomBar = { PieDeApp(
            Modifier
                .size(415.dp, 40.dp)
        )}
    ){
        Column(
            modifier = Modifier
                .padding(top = 95.dp, bottom = 40.dp),
        ){
            BuildsDeLaComunidad()
        }
    }
}