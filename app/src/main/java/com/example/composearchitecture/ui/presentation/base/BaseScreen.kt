package com.example.composearchitecture.ui.presentation.base

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import com.example.composearchitecture.ui.presentation.theme.AppColor
import com.example.composearchitecture.ui.presentation.theme.util.sdp

@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    isLoading: Boolean = false,
    edgeToEdge: Boolean = false,
    backGroundImg: Int? = null,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable() (ColumnScope.() -> Unit)
) {
    val focusManager = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current

    if (backGroundImg != null) {
        backGroundImg.let {
            Image(
                painter = painterResource(it),
                modifier = Modifier.fillMaxSize(),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onPress = {
                                keyboardController?.hide()
                                focusManager.clearFocus()
                            }
                        )
                    },
            ) {
                Column(
                    modifier = modifier
                        .fillMaxSize()
                        .then((if (edgeToEdge) Modifier else Modifier.systemBarsPadding())),
                    verticalArrangement = verticalArrangement,
                    horizontalAlignment = horizontalAlignment,
                ) {
                    content()
                }
            }
        }
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(AppColor.white)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onPress = {
                            keyboardController?.hide()
                            focusManager.clearFocus()
                        }
                    )
                },
        ) {
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .then((if (edgeToEdge) Modifier else Modifier.systemBarsPadding())),
                verticalArrangement = verticalArrangement,
                horizontalAlignment = horizontalAlignment,
            ) {
                content()
            }
        }
    }
    if (isLoading) {
        IndeterminateCircularIndicator()
    }
}

@Composable
fun IndeterminateCircularIndicator(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .clickable(enabled = false) { }
            .background(color = Color.White.copy(alpha = 0.5f)),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            modifier = modifier.width(56.sdp),
            color = Color.Black, trackColor = Color.White,
        )
    }
}