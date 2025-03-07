package com.example.composearchitecture.ui.presentation.theme.color

import androidx.compose.ui.graphics.Color

data class MyColors(
    val material: Color,
    val warning: Color,
    val onWarning: Color,
    val black: Color,
    val black5: Color = hexToColor("#0D000000"),
    val white: Color = Color.White,

    val black40: Color = hexToColor("#66000000"),
    val white20: Color = hexToColor("#33ffffff"),
    val white30: Color = hexToColor("#4cffffff"),
    val white40: Color = hexToColor("#66ffffff"),
    val white70: Color = hexToColor("#b3ffffff"),
    val white100: Color = hexToColor("#ffffff"),
    val transparent: Color = Color.Transparent,
)
