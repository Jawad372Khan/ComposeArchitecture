package com.example.composearchitecture.ui.presentation.theme.typography


import androidx.compose.material3.Typography
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import com.example.composearchitecture.ui.presentation.theme.extensions.textSize
import com.example.composearchitecture.ui.presentation.theme.font.poppinsBold
import com.example.composearchitecture.ui.presentation.theme.font.poppinsMedium
import com.example.composearchitecture.ui.presentation.theme.font.poppinsRegular
import com.example.composearchitecture.ui.presentation.theme.font.poppinsSemiBold


private val parentStyle = TextStyle(
    platformStyle = PlatformTextStyle()
)

private val fontBoldStyle = parentStyle.copy(fontFamily = poppinsBold)
private val fontSemiBoldStyle = parentStyle.copy(fontFamily = poppinsSemiBold)
private val fontMediumStyle = parentStyle.copy(fontFamily = poppinsMedium)
private val fontRegularStyle = parentStyle.copy(fontFamily = poppinsRegular)

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