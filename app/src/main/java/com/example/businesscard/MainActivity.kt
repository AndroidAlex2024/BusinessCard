package com.example.businesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
//horizontalAlignment = Alignment.CenterHorizontally,

        Modifier.fillMaxSize()
        //Modifier
        .padding(10.dp)
           // .background(Color.Blue)
    ) {
        Column {
val image = painterResource(R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = null

            )
            Text(
                text = "AndroidAlex2024",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = modifier

            )
            Text(
                text = "he a new delevoper ",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = modifier
            )
        }
        Column {

            Text(
                text = "+7 950 000 00 00",
                modifier = modifier
            )
            Text(
                text = "email: ",
                modifier = modifier
            )
            Text(
                text = "AndroidAlex2024.ololo@gmail.com",
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Greeting("Android")
    }
}