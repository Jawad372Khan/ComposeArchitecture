package com.example.composearchitecture.ui.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import com.example.composearchitecture.R
import com.example.composearchitecture.ui.presentation.theme.AppColor
import com.example.composearchitecture.ui.presentation.theme.util.sdp

@Composable
internal fun CircularViewWithIcon(
    modifier: Modifier,
    icon : Int = R.drawable.ic_launcher_background,
    iconColor : Color? = null
){
    Box(
        modifier = modifier.size(52.sdp)
            .background(AppColor.circularViewBg, CircleShape),
        contentAlignment = Alignment.Center
    ){
        Image(
            modifier = Modifier.size(22.sdp),
            contentDescription = null,
            painter = painterResource(icon),
            colorFilter = iconColor?.let {
                if(isSystemInDarkTheme()){
                    ColorFilter.tint(iconColor)
                } else {
                    null
                }
            }
        )
    }
}