package com.example.composearchitecture.ui.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import com.example.composearchitecture.ui.presentation.theme.AppColor
import com.example.composearchitecture.ui.presentation.theme.AppShape
import com.example.composearchitecture.ui.presentation.theme.util.sdp
import com.example.composearchitecture.ui.presentation.theme.util.ssp

@Composable
fun ActionButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    height: Dp = 52.sdp,
    shape: Shape = AppShape.round50
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .clip(shape = shape)
            .height(height = height),
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = AppColor.buttonColor, shape = shape),
            contentAlignment = Alignment.Center
        ) {
            AppText(
                text = text,
                fontSize = 16.ssp,
                fontWeight = FontWeight.Bold,
                color = AppColor.buttonTextColor
            )
        }
    }
}