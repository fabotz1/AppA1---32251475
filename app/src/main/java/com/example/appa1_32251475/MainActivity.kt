package com.example.appa1_32251475

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Olá, mundo!")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello, $name!")
}