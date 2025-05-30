package com.example.composearchitecture.ui.presentation.extensions

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.Dp
import com.example.composearchitecture.ui.presentation.theme.util.sdp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Modifier.defaultHorizontalPadding(padding: Dp = 20.sdp): Modifier {
    return padding(horizontal = padding)
}

private var globalClickEnabled = true

/**
 * Adds a debounced clickable modifier, preventing multiple clicks within the specified delay.
 *
 * @param delayMillis The time to wait before allowing another click. Default is 700ms.
 * @param onClick The action to perform when clicked.
 * @return The modified [Modifier] with debounced click behavior.
 */
@Composable
fun Modifier.onClick(
    delayMillis: Long = 700,
    ripple: Boolean = false,
    onClick: () -> Unit): Modifier {
    val scope = rememberCoroutineScope()
//    var clickEnabled by remember { mutableStateOf(true) }
    if (ripple){
        return this.clickable(
            onClick = {
                if (globalClickEnabled) {
                    onClick.invoke()
                }
                globalClickEnabled = false
                scope.launch {
                    delay(delayMillis)
                    globalClickEnabled = true
                }
            },
        )
    }
    return this.clickable(
        onClick = {
//            if (clickEnabled) {
//                onClick.invoke()
//            }
//            clickEnabled = false
//            scope.launch {
//                delay(delayMillis)
//                clickEnabled = true
//            }
            if (globalClickEnabled) {
                onClick.invoke()
            }
            globalClickEnabled = false
            scope.launch {
                delay(delayMillis)
                globalClickEnabled = true
            }
        },
        indication = null,
        interactionSource = remember { MutableInteractionSource() }
    )
}

/**
 * Adds a debounced clickable modifier with optional alpha adjustment.
 *
 * @param enabled Whether the clickable is enabled. Default is true.
 * @param delayMillis The delay between consecutive clicks in milliseconds. Default is 700ms.
 * @param disabledAlpha The alpha value when the clickable is disabled. Default is 0.3f.
 * @param onClick The action to perform when clicked.
 * @return The modified [Modifier] with clickable behavior and alpha adjustment.
 */
@Composable
fun Modifier.onClick(
    enabled: Boolean = true,
    delayMillis: Long = 700,
    disabledAlpha: Float = 0.3f,
    onClick: () -> Unit
): Modifier {
    val alpha by remember { mutableFloatStateOf(if (enabled) 1f else disabledAlpha) }
    return this
        .alpha(alpha)
        .then(
            if (enabled) {
                Modifier.onClick(delayMillis = delayMillis, onClick = onClick)
            } else {
                Modifier
            }
        )
}