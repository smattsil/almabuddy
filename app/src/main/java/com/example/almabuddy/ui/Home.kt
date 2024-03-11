package com.example.almabuddy.ui

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.almabuddy.ui.theme.AlmabuddyTheme
import com.example.almabuddy.ui.theme.poppinsFontFamily

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .padding(top = 16.dp, bottom = 16.dp)
    ) {
        Text(
            text = "hi there",
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "hi there",
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
fun HomeScreenPreview(
) {
    HomeScreen()
}