package com.example.sem6

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

class BillingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Sem6Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BillingScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BillingScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Billing",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Billing Screen")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview13() {
    Sem6Theme {
        BillingScreen()
    }
}