package com.example.layout7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout7()
        }
    }
}

@Composable
fun Layout7() {
    Text(
        text = "BoaViagem",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth().
        background(Color.Black).
        padding(8.dp).
        padding(top = 32.dp)
    )
    Column(
        modifier = Modifier.fillMaxSize().padding(top = 70.dp).background(Color(0xFF015584)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Column(modifier = Modifier.padding(16.dp)) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                MenuItem(iconId = android.R.drawable.ic_menu_report_image, label = "Novo Gasto")
                MenuItem(iconId = android.R.drawable.ic_menu_myplaces, label = "Nova Viagem")
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                MenuItem(iconId = android.R.drawable.ic_menu_compass, label = "Minhas Viagens")
                MenuItem(iconId = android.R.drawable.ic_menu_manage, label = "Configurações")
            }
        }
    }
}

@Composable
fun MenuItem(iconId: Int, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = iconId),
            contentDescription = label,
            modifier = Modifier.size(80.dp),
            contentScale = ContentScale.Fit
        )
        Text(text = label, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewTravelAppHomeScreen() {
    Layout7()
}