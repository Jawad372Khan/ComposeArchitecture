package com.example.composearchitecture.ui.presentation.theme.color

import androidx.compose.ui.graphics.Color

val LightColorPalette = MyColors(
    material = Color(0xFF4684F8),
    warning = Color(0xFF90b5fb),
    onWarning = Color.Black,
    black = Color(0xFF000000),
)

internal fun hexToColor(hex: String): Color {
    return Color(android.graphics.Color.parseColor(hex))
}