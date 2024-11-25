package com.example.a132251475

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a132251475.ui.theme.AppA132251475Theme
import com.google.firebase.database.FirebaseDatabase


class MainActivity : ComponentActivity() {

    // Firebase setup
    private val database = FirebaseDatabase.getInstance()
    private val myRef = database.getReference("data") // Replace "data" with your desired path

    // State variable to hold the data
    //private val dataState = remember { mutableStateOf("") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppA132251475Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        // Input field for data
                        TextField(
                            value = dataState.value,
                            onValueChange = {
                                val it = ""
                                dataState.value = it
                            },
                            placeholder = "Enter your data"
                        )

                        // Buttons for CRUD operations
                        Row(modifier = Modifier.fillMaxWidth()) {
                            Button(onClick = { createData() }) {
                                Text("Create")
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                            Button(onClick = { readData() }) {
                                Text("Read")
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                            Button(onClick = { updateData() }) {
                                Text("Update")
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                            Button(onClick = { deleteData() }) {
                                Text("Delete")
                            }
                        }
                    }
                }
            }
        }
    }

    private fun TextField(value: String, onValueChange: () -> Unit, placeholder: String) {
        TODO("Not yet implemented")
    }

    // Functions for CRUD operations (implement the logic here)
    private fun createData() {
        val data = dataState.value
        // Use myRef.push().setValue(data) to create a new entry
    }

    private fun readData() {
        // Use myRef.addValueEventListener to read data
        // Update the UI with the retrieved data (optional)
    }

    private fun updateData() {
        val data = dataState.value
        val key = "your_key" // Replace with actual key for update
        // Use myRef.child(key).setValue(data) to update existing data
    }

    private fun deleteData() {
        val key = "your_key" // Replace with actual key for deletion
        // Use myRef.child(key).removeValue() to delete data
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppA132251475Theme {
        Greeting("Android")
    }
}