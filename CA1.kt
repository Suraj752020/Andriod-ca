package com.example.sem6

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sem6.ui.theme.Sem6Theme
import kotlin.jvm.java

class CA1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Sem6Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DashBoardScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun DashBoardScreen(modifier: Modifier = Modifier) {

    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Dashboard",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                val intent = Intent(context, ProfileActivity::class.java)

                // Passing data
                intent.putExtra("name", "Suraj Kumar")
                intent.putExtra("age", "21")
                intent.putExtra("disease", "Fever")
                intent.putExtra("address", "Punjab")

                context.startActivity(intent)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Patient Profile")
        }

        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
                context.startActivity(Intent(context, AppointmentActivity::class.java))
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Appointments")
        }

        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
                context.startActivity(Intent(context, BillingActivity::class.java))
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Billing")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview10() {
    Sem6Theme {
        DashBoardScreen()
    }
}