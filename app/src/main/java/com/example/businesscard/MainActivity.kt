package com.example.businesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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

                    Greeting(
                        dev_name = stringResource(R.string.dev_name),
                        dev_desc = stringResource(R.string.dev_desc),
                        dev_phone = stringResource(R.string.dev_phone),
                        dev_share = stringResource(R.string.dev_share),
                        dev_mail = stringResource(R.string.dev_mail),

                    )

            }
        }
    }
}

// Created by AndroidAlex2024 for learn https://developer.android.com/codelabs/basic-android-kotlin-compose-business-card#0

@Composable
fun Greeting(dev_name: String, dev_desc: String, dev_phone: String, dev_share: String, dev_mail: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4))
    ) {
        Column(

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .fillMaxSize()
                .padding(top = 275.dp, start = 20.dp, end = 20.dp, bottom = 40.dp)

        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .padding(top = 0.dp, start = 0.dp, end = 0.dp, bottom = 0.dp)


            ) {

                val image = painterResource(R.drawable.android_logo)
                Image(
                    painter = image,
                    contentDescription = null,
                    Modifier

                        .background(Color(0xFF073042))
                        .size(105.dp, 105.dp)
                )
                Text(
                    text = dev_name,
                    fontSize = 40.sp,
                    modifier = modifier
                        .padding(top = 5.dp)

                )
                Text(
                    text = dev_desc,
                    fontWeight = FontWeight.Bold,
                    color=Color(0xFF1A794B),
                    fontSize = 14.sp,
                    modifier = modifier
                        .padding(top = 5.dp)
                )
            }
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp)

            ) {

                Row (


                ){
                    val image = painterResource(R.drawable.phone)
                    Image(
                        painter = image,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color(0xFF1A794B)),
                        modifier = modifier
                            .size(24.dp, 24.dp)

                    )
                    Text(
                        text = dev_phone,
                        Modifier
                            .padding(start = 25.dp)
                            .width(200.dp)
                    )
                }
                Row (
                    modifier = modifier
                    .padding(top=5.dp)
                ){
                    val image = painterResource(R.drawable.share)
                    Image(
                        painter = image,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color(0xFF1A794B)),
                        modifier = modifier
                            .size(24.dp, 24.dp)

                    )
                    Text(
                        text = dev_share,
                        modifier = modifier
                            .padding(start = 25.dp)
                            .width(200.dp)

                    )
                }
                Row (
                    modifier = modifier
                        .padding(top=5.dp)
                ){
                    val image = painterResource(R.drawable.mail)
                    Image(
                        painter = image,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color(0xFF1A794B)),
                        modifier = modifier
                            .size(24.dp, 24.dp)

                    )
                    Text(
                        text = dev_mail,
                        modifier = modifier
                            .padding(start = 25.dp)
                            .width(200.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true,
)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Greeting(
            dev_name = stringResource(R.string.dev_name),
            dev_desc = stringResource(R.string.dev_desc),
            dev_phone = stringResource(R.string.dev_phone),
            dev_share = stringResource(R.string.dev_share),
            dev_mail = stringResource(R.string.dev_mail),
        )
    }
}