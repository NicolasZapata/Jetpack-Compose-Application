package com.nicolas.jetpack_compose_application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.nicolas.jetpack_compose_application.ui.theme.JetpackComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    simpleComposable()
                }
            }
        }
    }
}

@Composable
fun simpleComposable() {
    val checkState = remember { mutableStateOf(false) }
    Text(text = "Ésta es una demostración de una aplicación utilizando Jetpack Compose a base del " +
            "tutorial del programador y youtuber Leonardo Morales donde se aplican dichos conceptos")
    Checkbox(
        checked = checkState.value,
        onCheckedChange = { checkState.value = !checkState.value }
    )
}

@Preview(name = "NicolasApp", showBackground = true, showSystemUi = true,
    device = Devices.DEFAULT)

@Composable
fun DefaultPreview() {
    JetpackComposeApplicationTheme {
        simpleComposable()
    }
}