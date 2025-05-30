package com.example.composearchitecture.ui.presentation.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import com.example.composearchitecture.ui.presentation.theme.AppColor
import com.example.composearchitecture.ui.presentation.theme.AppShape
import com.example.composearchitecture.ui.presentation.theme.util.sdp
import com.example.composearchitecture.ui.presentation.theme.util.ssp

@Composable
fun AppBasicTextField(
    modifier: Modifier = Modifier,
    value: String = "",
    label: String = "",
    height: Dp = 52.sdp,
    imeAction: ImeAction = ImeAction.Done,
    keyboardType: KeyboardType = KeyboardType.Text,
    enable: Boolean = true,
    trailingIcon: @Composable (() -> Unit)? = null,
    onValueChange: (String) -> Unit,
) {
    OutlinedTextField(
        modifier = modifier.height(height = height),
        value = value,
        onValueChange = onValueChange,
        enabled = enable,
        shape = AppShape.round10,
        trailingIcon = trailingIcon,
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            imeAction = imeAction,
            keyboardType = keyboardType
        ),
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = AppColor.white,
            unfocusedTextColor = AppColor.white,
            disabledTextColor = AppColor.white,
            focusedContainerColor = AppColor.containerColor,
            unfocusedContainerColor = AppColor.containerColor,
            focusedBorderColor = AppColor.borderColor,
            unfocusedBorderColor = AppColor.borderColor,
            disabledBorderColor = AppColor.borderColor,
        ),
        label = {
            AppText(
                text = label,
                color = AppColor.labelColor,
                fontSize = 16.ssp,
                fontWeight = FontWeight.Normal
            )
        },
    )
}