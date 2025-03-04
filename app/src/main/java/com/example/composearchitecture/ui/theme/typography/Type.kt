package com.example.composearchitecture.ui.theme.typography


import androidx.compose.material3.Typography
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import com.example.composearchitecture.ui.theme.extensions.textSize
import com.example.composearchitecture.ui.theme.font.figtreeBold
import com.example.composearchitecture.ui.theme.font.figtreeMedium
import com.example.composearchitecture.ui.theme.font.figtreeRegular
import com.example.composearchitecture.ui.theme.font.figtreeSemiBold


private val parentStyle = TextStyle(
    platformStyle = PlatformTextStyle()
)

private val fontBoldStyle = parentStyle.copy(fontFamily = figtreeBold)
private val fontSemiBoldStyle = parentStyle.copy(fontFamily = figtreeSemiBold)
private val fontMediumStyle = parentStyle.copy(fontFamily = figtreeMedium)
private val fontRegularStyle = parentStyle.copy(fontFamily = figtreeRegular)

val CustomTypography = MyTypography(
    typography = Typography(),

    bold36 = fontBoldStyle.copy(fontSize = 36.textSize),
    bold28 = fontBoldStyle.copy(fontSize = 28.textSize),
    bold = fontBoldStyle,

    regular26 = fontRegularStyle.copy(fontSize = 26.textSize),
    regular24 = fontRegularStyle.copy(fontSize = 24.textSize),
    regular = fontRegularStyle,

    medium32 = fontMediumStyle.copy(fontSize = 32.textSize),
    medium20 = fontMediumStyle.copy(fontSize = 20.textSize),
    medium = fontMediumStyle,

    semiBold28 = fontSemiBoldStyle.copy(fontSize = 28.textSize),
    semiBold = fontSemiBoldStyle
)