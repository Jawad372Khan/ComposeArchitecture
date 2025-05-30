package com.example.composearchitecture.ui.presentation.components

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun ColumnScope.WeightSpacer(weight: Float) {
    androidx.compose.foundation.layout.Spacer(modifier = Modifier.weight(weight = weight))
}

@Composable
fun RowScope.Spacer(weight: Float) {
    androidx.compose.foundation.layout.Spacer(modifier = Modifier.weight(weight = weight))
}

@Suppress("UnusedReceiverParameter")
@Composable
fun ColumnScope.ColumnSpacer(height: Dp) {
    androidx.compose.foundation.layout.Spacer(modifier = Modifier.height(height))
}

@Suppress("UnusedReceiverParameter")
@Composable
fun RowScope.RowSpacer(width: Dp) {
    androidx.compose.foundation.layout.Spacer(modifier = Modifier.width(width))
}