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

class ParisActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_2),
        )
        Image(
            painterResource(id = R.drawable.paris), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Arrival in Zurich\n" +

                    "Arrive in Zurich and check into your accommodation.\n" +
                    "Take a walk around the Old Town (Altstadt) to get familiar with the city.\n" +
                    "Visit Lake Zurich for a relaxing boat ride and enjoy the beautiful views.\n" +
                    "Have dinner at a local Swiss restaurant to try Swiss fondue.\n" +

                    "\n" +
                    "Day 2: Explore Zurich\n" +

                    "Visit the Kunsthaus Zurich (Zurich Art Museum) for Swiss and international art.\n" +
                    "Explore Bahnhofstrasse, one of the world's most exclusive shopping streets.\n" +
                    "Visit the Swiss National Museum to learn about Swiss cultural history.\n" +
                    "Enjoy a Swiss-style dinner at a local restaurant.\n" +

                    "\n" +
                    "Day 3: Lucerne and Mount Pilatus\n" +

                    "Take a day trip to Lucerne and explore the Chapel Bridge and Water Tower.\n" +
                    "Visit the Swiss Museum of Transport or the Lion Monument.\n" +
                    "Take a scenic ride up Mount Pilatus for panoramic views of the Swiss Alps.\n" +
                    "Return to Zurich for dinner at a local restaurant.\n" +

                    "\n" +
                    "Day 4: Interlaken and Jungfraujoch\n" +

                    "Travel to Interlaken, nestled between Lake Thun and Lake Brienz.\n" +
                    "Take a cogwheel train to Jungfraujoch, the highest railway station in Europe.\n" +
                    "Explore the Ice Palace and enjoy spectacular views of the Aletsch Glacier.\n" +
                    "Return to Interlaken and enjoy dinner with mountain views.\n" +

                    "\n" +
                    "Day 5: Lauterbrunnen and Trummelbach Falls\n" +

                    "Visit the stunning Lauterbrunnen Valley, known for its waterfalls.\n" +
                    "Hike to the impressive Trummelbach Falls, a series of waterfalls inside a mountain.\n" +
                    "Explore the charming village of Wengen or Mürren.\n" +
                    "End the day with a Swiss dinner in Lauterbrunnen.\n" +

                    "\n" +
                    "Day 6: Zermatt and the Matterhorn\n" +

                    "Travel to Zermatt and take the Gornergrat Railway for stunning views of the Matterhorn.\n" +
                    "Explore Zermatt village, famous for its charming car-free streets.\n" +
                    "Enjoy skiing or hiking depending on the season.\n" +
                    "Have dinner in Zermatt with a view of the Matterhorn.\n" +

                    "\n" +
                    "Day 7: Geneva\n" +

                    "Travel to Geneva, a city known for its international organizations.\n" +
                    "Visit the United Nations headquarters and the Jet d'Eau fountain.\n" +
                    "Explore the Old Town and the St. Pierre Cathedral.\n" +
                    "Relax at the Parc des Bastions and have dinner at a local restaurant.\n" +

                    "\n" +
                    "Day 8: Montreux and Chillon Castle\n" +

                    "Take a day trip to Montreux on Lake Geneva’s shores.\n" +
                    "Visit the famous Chillon Castle, one of Switzerland’s most beautiful medieval castles.\n" +
                    "Take a stroll along the Montreux lakeside promenade.\n" +
                    "Enjoy a lakeside dinner in Montreux.\n" +

                    "\n" +
                    "Day 9: Bern\n" +

                    "Travel to Bern, Switzerland’s capital city.\n" +
                    "Explore the medieval Old Town, a UNESCO World Heritage site.\n" +
                    "Visit the Zytglogge clock tower and the Federal Palace.\n" +
                    "End the day with a visit to the Bear Park and dinner in Bern's Old Town.\n" +

                    "\n" +
                    "Day 10: Departure\n" +

                    "Take a final stroll around Zurich or visit the Swiss Alps for some last-minute views.\n" +
                    "Do some souvenir shopping before heading to the airport.\n" +
                    "Farewell dinner before your flight home, cherishing the Swiss adventure."
        )
    }
}

