package com.example.weatherapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.example.weatherapp.ui.theme.Purple200
import com.example.weatherapp.ui.theme.Purple700
import com.example.weatherapp.ui.theme.Teal200
import com.example.weatherapp.ui.theme.Purple500
import com.example.weatherapp.ui.theme.Shapes
import com.example.weatherapp.ui.theme.Typography

@Composable
fun WeatherAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}