package com.example.businesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
        horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
        //Modifier
            .padding(top=60.dp,start=20.dp,end=20.dp,bottom=20.dp)
           // .background(Color.Blue)
    ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(top=0.dp,start=0.dp,end=0.dp,bottom=0.dp)
                .background(Color.Red)
               // .fillMaxHeight()
        ){

val         image = painterResource(R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = null,
                        Modifier
                            .padding(start=80.dp,end=80.dp)
                            .background(Color.Blue)
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
        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                //.padding(top=120.dp,start=0.dp,end=0.dp,bottom=0.dp)
                .background(Color.Red)
                .fillMaxWidth()

        ){

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