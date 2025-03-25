package com.example.ppbd_tugas3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import com.example.ppbd_tugas3.ui.theme.PPBDTugas3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PPBDTugas3Theme  {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        to = "Halo wok",
                        message = "- Wish You All The Best -",
                        from = "From Tedy",
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(to: String, message: String, from: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = to,
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier.padding(bottom = 60.dp)
            )
            Text(
                text = message,
                fontSize = 30.sp,
                lineHeight = 80.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier=Modifier.padding(top = 90.dp)
            )
        }
        Text(
            text = from,
            fontSize = 30.sp,
            color = Color.White,
            modifier = Modifier
                .padding(bottom = 80.dp)
                .align(Alignment.BottomCenter)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    PPBDTugas3Theme  {
        GreetingText(to = "Halo wok" , message = "-Wish You All The Best-", from = "From Tedy")
    }
}