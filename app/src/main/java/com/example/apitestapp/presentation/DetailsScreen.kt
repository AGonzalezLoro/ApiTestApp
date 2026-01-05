package com.example.apitestapp.presentation

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.apitestapp.R

@Composable
fun DetailsScreen(image: String, description: String, race: String, ki: String) {
    val img = image.replace("\\", "/")
    Box(modifier = Modifier.fillMaxSize()) {
        AsyncImage(
            model = img,
            contentDescription = "character image",
            modifier = Modifier
                .padding(10.dp)
                .fillMaxHeight(),
            contentScale = ContentScale.FillHeight,
        )

        LazyColumn(
            modifier = Modifier
                .padding(20.dp, 40.dp)
                .background(Color.Black.copy(alpha = 0.2f))
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            item {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = description,
                    color = Color.White,
                    fontSize = 18.sp,
                    letterSpacing = 0.5.sp
                )
            }

            item {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Raza: $race",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    letterSpacing = 0.5.sp
                )
            }

            item {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "ki: $ki",
                    color = Color.Cyan,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    letterSpacing = 0.5.sp
                )
            }
        }
    }


}