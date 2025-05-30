package com.example.composearchitecture.ui.presentation.theme.color

import androidx.compose.ui.graphics.Color

val LightColorPalette = MyColors(
    material = Color(0xFF4684F8),
    warning = Color(0xFF90b5fb),
    onWarning = Color.Black,
    black = Color(0xFF000000),
    bgColor = Color(0xFFE2ECFF),
    titleTextColor = Color(0xFF1868FE),
    subTitleTextColor = Color(0xFF494545),
    circularViewBg = Color(0xFFFFFFFF),
    iconColor = Color(0xFF252525),
    semiBoldText = Color(0xFF000000),
    borderColor = Color(0xFF6DA0FF),
    containerColor = Color(0xFFFFFFFF),
    labelColor = Color(0xFFAAAAAA),
    buttonColor = Color(0xFF1868FE),
    buttonTextColor = Color(0xFFFFFFFF),
    termsTextColor = Color(0xFF777777)
)

internal fun hexToColor(hex: String): Color {
    return Color(android.graphics.Color.parseColor(hex))
}