package com.example.composearchitecture.ui.presentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import com.example.composearchitecture.ui.presentation.theme.AppColor
import com.example.composearchitecture.ui.presentation.theme.util.ssp

@Composable
internal fun Heading(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = AppColor.titleTextColor,
    fontSize: TextUnit = 32.ssp,
    lineHeight: TextUnit = 32.ssp,
    fontWeight: FontWeight = FontWeight.Bold,
) {
    Text(
        text = text,
        color = color,
        fontSize = fontSize,
        lineHeight = lineHeight,
        fontWeight = fontWeight,
        modifier = modifier
    )
}

@Composable
internal fun AppText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = AppColor.subTitleTextColor,
    fontSize: TextUnit = 16.ssp,
    lineHeight: TextUnit = 16.ssp,
    fontWeight: FontWeight = FontWeight.Normal,
    textDecoration: TextDecoration = TextDecoration.None
) {
    Text(
        text = text,
        color = color,
        fontSize = fontSize,
        lineHeight = lineHeight,
        fontWeight = fontWeight,
        modifier = modifier,
        textDecoration = textDecoration
    )
}

@Composable
internal fun AppTextWithTextAlign(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = AppColor.subTitleTextColor,
    fontSize: TextUnit = 16.ssp,
    lineHeight: TextUnit = 16.ssp,
    fontWeight: FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Center
) {
    Text(
        text = text,
        color = color,
        fontSize = fontSize,
        lineHeight = lineHeight,
        fontWeight = fontWeight,
        textAlign = textAlign,
        modifier = modifier
    )
}