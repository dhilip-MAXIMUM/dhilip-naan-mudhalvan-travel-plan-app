package com.example.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class BaliActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PlaceOne()
                }
            }
        }
    }
}

@Composable
fun PlaceOne() {
    Column(modifier = Modifier.background(color = Color.White)
        .padding(20.dp)
        .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_1),
        )
        Image(
            painterResource(id = R.drawable.bali), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Arrival in Tokyo and Relaxation\n" +
                    "Arrive in Tokyo and check into your accommodation.\n" +
                    "Spend the day exploring your neighborhood or relaxing.\n" +
                    "Take an evening walk around Shinjuku and enjoy the vibrant city life.\n" +
                    "\n" +

                    "Day 2: Asakusa and Senso-ji Temple\n" +
                    "Start your day with a visit to Asakusa and the famous Senso-ji Temple.\n" +
                    "Explore the Nakamise Street market for souvenirs and local snacks.\n" +
                    "In the evening, enjoy a river cruise along the Sumida River.\n" +
                    "\n" +

                    "Day 3: Shibuya and Harajuku\n" +
                    "Visit the iconic Shibuya Crossing and explore the trendy Harajuku district.\n" +
                    "Stop by Meiji Shrine, one of Tokyo’s most important Shinto shrines.\n" +
                    "Shop for the latest fashion trends in Omotesando or Takeshita Street.\n" +
                    "\n" +

                    "Day 4: Odaiba and Tokyo Bay\n" +
                    "Head to Odaiba, an artificial island with entertainment and shopping.\n" +
                    "Visit teamLab Borderless for an immersive digital art experience.\n" +
                    "End your day with a beautiful view of the Rainbow Bridge and Tokyo Bay.\n" +
                    "\n" +

                    "Day 5: Tokyo Disneyland or DisneySea\n" +
                    "Spend a day at Tokyo Disneyland or DisneySea, the magical amusement parks.\n" +
                    "Enjoy rides, parades, and the unique atmosphere of Disney parks.\n" +
                    "Relax and have dinner at one of the themed restaurants.\n" +
                    "\n" +

                    "Day 6: Akihabara and Electronics District\n" +
                    "Dive into the world of anime, manga, and technology in Akihabara.\n" +
                    "Shop for the latest gadgets, electronics, and otaku merchandise.\n" +
                    "Take a break in one of Akihabara’s themed cafes, such as a maid cafe.\n" +
                    "\n" +

                    "Day 7: Day Trip to Nikko\n" +
                    "Take a day trip to Nikko, a UNESCO World Heritage Site.\n" +
                    "Visit Toshogu Shrine, famous for its elaborate carvings and the sacred bridge.\n" +
                    "Explore the natural beauty of Nikko, including waterfalls and hot springs.\n" +
                    "\n" +

                    "Day 8: Roppongi Hills and Tokyo Tower\n" +
                    "Visit Roppongi Hills for panoramic views of Tokyo from the observation deck.\n" +
                    "Take a trip to Tokyo Tower for another iconic view of the city.\n" +
                    "In the evening, explore the nightlife in the Roppongi district.\n" +
                    "\n" +

                    "Day 9: Tsukiji Fish Market and Ginza\n" +
                    "Visit the famous Tsukiji Fish Market for fresh seafood and sushi.\n" +
                    "Explore the upscale shopping district of Ginza.\n" +
                    "In the evening, enjoy a rooftop dinner with a view of the Tokyo skyline.\n" +
                    "\n" +

                    "Day 10: Departure\n" +
                    "Take a last stroll around your favorite areas in Tokyo.\n" +
                    "Do some final shopping and enjoy a farewell lunch.\n" +
                    "Head to the airport and depart Tokyo, taking home unforgettable memories."
        )


    }
}

