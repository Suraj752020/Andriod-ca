package com.example.sem6

import android.location.Address
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sem6.ui.theme.Sem6Theme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Receiving data from intent
        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        val disease = intent.getStringExtra("disease")
        val address = intent.getStringExtra("address")

        setContent {
            Sem6Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProfileScreen(
                        name = name,
                        age = age,
                        disease = disease,
                        address = address,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileScreen(
    name: String?,
    age: String?,
    disease: String?,
    address: String?,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Patient Profile",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Name: $name")
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Age: $age")
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Disease: $disease")
        Spacer(modifier=Modifier.height(8.dp))

        Text(text = "Address: $address")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview11() {
    Sem6Theme {
        ProfileScreen(
            name = "Suraj Kumar",
            age = "21",
            disease = "Fever",
            address = "Punjab"
        )
    }
}