package com.example.composearchitecture.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalConfiguration
import com.example.composearchitecture.ui.theme.color.DarkColorPalette
import com.example.composearchitecture.ui.theme.color.LightColorPalette
import com.example.composearchitecture.ui.theme.color.MyColors
import com.example.composearchitecture.ui.theme.extensions.screenHeight
import com.example.composearchitecture.ui.theme.extensions.screenWidth
import com.example.composearchitecture.ui.theme.shapes.CustomShapes
import com.example.composearchitecture.ui.theme.shapes.MyShapes
import com.example.composearchitecture.ui.theme.typography.CustomTypography
import com.example.composearchitecture.ui.theme.typography.MyTypography

private val LocalColors = staticCompositionLocalOf { LightColorPalette }
private val LocalTypography = staticCompositionLocalOf { CustomTypography }
private val LocalShapes = staticCompositionLocalOf { CustomShapes }
private var isDarkTheme = false

@SuppressLint("NewApi")
@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    isDarkTheme = darkTheme
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val config = LocalConfiguration.current
    screenWidth = config.screenWidthDp
    screenHeight = config.screenHeightDp


    val myTypography = LocalTypography.current
    val myShapes = LocalShapes.current

    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides myTypography,
        LocalShapes provides myShapes,
    ) {
        MaterialTheme(
            typography = myTypography.typography,
            shapes = myShapes.shapes,
            content = content
        )
    }
}

val AppColor: MyColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current

val AppColorNC: MyColors = if (isDarkTheme) DarkColorPalette else LightColorPalette

val AppTypography: MyTypography
    @Composable
    @ReadOnlyComposable
    get() = LocalTypography.current

val AppShape: MyShapes
    @Composable
    @ReadOnlyComposable
    get() = LocalShapes.current
