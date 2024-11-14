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

class SingaporeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2()
                }
            }
        }
    }
}

@Composable
fun Greeting2() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_3),
        )
        Image(
            painterResource(id = R.drawable.singapore), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color = Color.Black,
            text = "Day 1: Arrival in Sydney\n" +
                    "Morning: Arrive in Sydney and check into your hotel.\n" +
                    "Afternoon: Explore Circular Quay and The Rocks area, including Sydney Harbour Bridge and Opera House.\n" +
                    "Evening: Take a sunset cruise on Sydney Harbour and enjoy dinner with a view.\n" +

                    "\n" +
                    "Day 2: Sydney Sightseeing\n" +
                    "Morning: Visit Bondi Beach and enjoy a coastal walk to Coogee.\n" +
                    "Afternoon: Explore the Royal Botanic Garden and Darling Harbour.\n" +
                    "Evening: Have dinner at a waterfront restaurant in Darling Harbour.\n" +

                    "\n" +
                    "Day 3: Blue Mountains Day Trip\n" +
                    "Full day: Take a day trip to the Blue Mountains, visit Echo Point and the Three Sisters rock formation.\n" +
                    "Explore Scenic World and enjoy the stunning views of waterfalls and rainforest.\n" +

                    "\n" +
                    "Day 4: Travel to Melbourne\n" +
                    "Morning: Take a flight to Melbourne.\n" +
                    "Afternoon: Explore Federation Square and visit the National Gallery of Victoria.\n" +
                    "Evening: Visit the Eureka Skydeck for panoramic views of the city.\n" +

                    "\n" +
                    "Day 5: Melbourne Highlights\n" +
                    "Morning: Visit the Royal Botanic Gardens and enjoy a picnic.\n" +
                    "Afternoon: Explore the laneways and street art of Melbourne’s CBD.\n" +
                    "Evening: Have dinner in Chinatown and experience Melbourne’s multicultural cuisine.\n" +

                    "\n" +
                    "Day 6: Great Ocean Road\n" +
                    "Full day: Take a scenic drive along the Great Ocean Road and visit the Twelve Apostles.\n" +
                    "Stop at the Loch Ard Gorge and enjoy the stunning coastline views.\n" +

                    "\n" +
                    "Day 7: Travel to Cairns\n" +
                    "Morning: Take a flight to Cairns.\n" +
                    "Afternoon: Visit the Cairns Esplanade and Lagoon for a relaxing swim.\n" +
                    "Evening: Enjoy a seafood dinner at a local restaurant along the waterfront.\n" +

                    "\n" +
                    "Day 8: Great Barrier Reef\n" +
                    "Full day: Take a day tour to the Great Barrier Reef, go snorkeling or scuba diving to explore the vibrant marine life.\n" +

                    "\n" +
                    "Day 9: Daintree Rainforest\n" +
                    "Full day: Explore the Daintree Rainforest, take a guided walk, and visit Cape Tribulation.\n" +
                    "Enjoy a river cruise to spot crocodiles and other wildlife.\n" +

                    "\n" +
                    "Day 10: Departure\n" +
                    "Morning: Last-minute shopping in Cairns.\n" +
                    "Afternoon: Depart from Cairns and fly back home.\n"
        )
    }
}

