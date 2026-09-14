package com.example.scale.designsystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF2E6C4D),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFB4F1CE),
    secondary = Color(0xFF4E6355),
    tertiary = Color(0xFF3D6473),
    error = Color(0xFFBA1A1A),
    surfaceVariant = Color(0xFFDCE5DC),
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFF99D5B0),
    onPrimary = Color(0xFF00391F),
    primaryContainer = Color(0xFF145236),
    secondary = Color(0xFFB5CCBB),
    tertiary = Color(0xFFA5CDDE),
    error = Color(0xFFFFB4AB),
    surfaceVariant = Color(0xFF404943),
)

@Composable
public fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = if (isSystemInDarkTheme()) DarkColors else LightColors) {
        Surface(color = MaterialTheme.colorScheme.background) { content() }
    }
}
