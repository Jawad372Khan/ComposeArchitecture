package com.example.composearchitecture.ui.presentation.display.register

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import com.example.composearchitecture.R
import com.example.composearchitecture.ui.presentation.base.BaseScreen
import com.example.composearchitecture.ui.presentation.components.ActionButton
import com.example.composearchitecture.ui.presentation.components.AppBasicTextField
import com.example.composearchitecture.ui.presentation.components.AppText
import com.example.composearchitecture.ui.presentation.components.AppTextWithTextAlign
import com.example.composearchitecture.ui.presentation.components.CircularViewWithIcon
import com.example.composearchitecture.ui.presentation.components.ColumnSpacer
import com.example.composearchitecture.ui.presentation.components.Heading
import com.example.composearchitecture.ui.presentation.components.RowSpacer
import com.example.composearchitecture.ui.presentation.extensions.defaultHorizontalPadding
import com.example.composearchitecture.ui.presentation.theme.AppColor
import com.example.composearchitecture.ui.presentation.theme.util.sdp
import com.example.composearchitecture.ui.presentation.theme.util.ssp

@Composable
internal fun RegistrationScreen(

){
    BaseScreen(
        modifier = Modifier.fillMaxSize()
            .defaultHorizontalPadding(),
        edgeToEdge = true
    ) {
        if(!isLandscape()){
            ColumnSpacer(80.sdp)

            Heading(
                modifier = Modifier,
                text = "Sign Up",
            )

            ColumnSpacer(18.sdp)

            AppText(
                modifier = Modifier,
                text = "Please login or sign up to continue using\nour app",
                color = AppColor.subTitleTextColor,
            )

            ColumnSpacer(20.sdp)

            AppText(
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                text = "Enter via Social Networks",
                color = AppColor.subTitleTextColor,
            )

            ColumnSpacer(20.sdp)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                CircularViewWithIcon(
                    modifier = Modifier,
                    icon = R.drawable.ic_apple,
                    iconColor = AppColor.iconColor
                )

                RowSpacer(8.sdp)

                CircularViewWithIcon(
                    modifier = Modifier,
                    icon = R.drawable.ic_google,
                    iconColor = AppColor.iconColor
                )
            }

            ColumnSpacer(20.sdp)

            AppTextWithTextAlign(
                text = "or login with\n" +
                        "email",
                fontSize = 16.ssp,
                fontWeight = FontWeight.SemiBold,
                color = AppColor.semiBoldText,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

            ColumnSpacer(80.sdp)

            AppBasicTextField(
                modifier = Modifier.fillMaxWidth(),
                onValueChange = {

                },
                label = "Your Email",
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Email
            )

            ColumnSpacer(24.sdp)

            AppBasicTextField(
                modifier = Modifier.fillMaxWidth(),
                onValueChange = {

                },
                label = "Password",
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Password
            )

            ColumnSpacer(24.sdp)

            ActionButton(
                onClick = {

                },
                text = "Create account"
            )

            ColumnSpacer(36.sdp)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                AppText(
                    modifier = Modifier,
                    text = "Already have an account? ",
                    color = AppColor.subTitleTextColor,
                    fontSize = 14.ssp,
                    fontWeight = FontWeight.Normal,
                    lineHeight = 14.ssp
                )


                AppText(
                    modifier = Modifier,
                    text = "Login",
                    color = AppColor.buttonColor,
                    fontSize = 14.ssp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 14.ssp,
                    textDecoration = TextDecoration.Underline
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 36.sdp),
                horizontalArrangement = Arrangement.Center
            ){
                AppText(
                    modifier = Modifier,
                    text = "I accept App’s ",
                    color = AppColor.termsTextColor,
                    fontSize = 12.ssp,
                    fontWeight = FontWeight.Normal,
                    lineHeight = 12.ssp
                )


                AppText(
                    modifier = Modifier,
                    text = "Terms of Use",
                    color = AppColor.termsTextColor,
                    fontSize = 12.ssp,
                    fontWeight = FontWeight.Normal,
                    lineHeight = 12.ssp,
                    textDecoration = TextDecoration.Underline
                )

                AppText(
                    modifier = Modifier,
                    text = " and ",
                    color = AppColor.termsTextColor,
                    fontSize = 12.ssp,
                    fontWeight = FontWeight.Normal,
                    lineHeight = 12.ssp
                )

                AppText(
                    modifier = Modifier,
                    text = "Privacy Policy.",
                    color = AppColor.termsTextColor,
                    fontSize = 12.ssp,
                    fontWeight = FontWeight.Normal,
                    lineHeight = 12.ssp,
                    textDecoration = TextDecoration.Underline
                )
            }
        } else {
            ColumnSpacer(40.sdp)

            Heading(
                modifier = Modifier,
                text = "Sign Up",
            )

            ColumnSpacer(18.sdp)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                AppText(
                    modifier = Modifier.align(alignment = Alignment.CenterVertically),
                    text = "Please login or sign up to continue using\nour app",
                    color = AppColor.subTitleTextColor,
                )

                AppBasicTextField(
                    modifier = Modifier.width(335.sdp),
                    onValueChange = {

                    },
                    label = "Your Email",
                    imeAction = ImeAction.Next,
                    keyboardType = KeyboardType.Email
                )
            }

            ColumnSpacer(24.sdp)

            Row(
                modifier = Modifier.fillMaxWidth().padding(start = 92.sdp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                AppText(
                    modifier = Modifier.align(alignment = Alignment.CenterVertically),
                    text = "Enter via Social Networks",
                    color = AppColor.subTitleTextColor,
                )

                AppBasicTextField(
                    modifier = Modifier.width(335.sdp),
                    onValueChange = {

                    },
                    label = "Password",
                    imeAction = ImeAction.Done,
                    keyboardType = KeyboardType.Password
                )
            }

            ColumnSpacer(24.sdp)

            Row(
                modifier = Modifier.fillMaxWidth().padding(start = 135.sdp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.Center
                ){
                    CircularViewWithIcon(
                        modifier = Modifier,
                        icon = R.drawable.ic_apple,
                        iconColor = AppColor.iconColor
                    )

                    RowSpacer(8.sdp)

                    CircularViewWithIcon(
                        modifier = Modifier,
                        icon = R.drawable.ic_google,
                        iconColor = AppColor.iconColor
                    )
                }


                ActionButton(
                    modifier = Modifier.width(335.sdp),
                    onClick = {

                    },
                    text = "Create account"
                )
            }

            ColumnSpacer(36.sdp)


            Row(
                modifier = Modifier.fillMaxWidth().padding(start = 141.sdp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){

                AppTextWithTextAlign(
                    text = "or login with\n" +
                            "email",
                    fontSize = 16.ssp,
                    fontWeight = FontWeight.SemiBold,
                    color = AppColor.semiBoldText,
                    modifier = Modifier.align(alignment = Alignment.CenterVertically)
                )

                Row(
                    modifier = Modifier.width(335.sdp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    AppText(
                        modifier = Modifier,
                        text = "Already have an account? ",
                        color = AppColor.subTitleTextColor,
                        fontSize = 14.ssp,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 14.ssp
                    )


                    AppText(
                        modifier = Modifier,
                        text = "Login",
                        color = AppColor.buttonColor,
                        fontSize = 14.ssp,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 14.ssp,
                        textDecoration = TextDecoration.Underline
                    )
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.End)
                    .padding(bottom = 36.sdp),
            ) {
                Row(
                    modifier = Modifier.width(353.sdp).align(Alignment.BottomEnd),
                    horizontalArrangement = Arrangement.Center
                ){
                    AppText(
                        modifier = Modifier,
                        text = "I accept App’s ",
                        color = AppColor.termsTextColor,
                        fontSize = 12.ssp,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 12.ssp
                    )


                    AppText(
                        modifier = Modifier,
                        text = "Terms of Use",
                        color = AppColor.termsTextColor,
                        fontSize = 12.ssp,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 12.ssp,
                        textDecoration = TextDecoration.Underline
                    )

                    AppText(
                        modifier = Modifier,
                        text = " and ",
                        color = AppColor.termsTextColor,
                        fontSize = 12.ssp,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 12.ssp
                    )

                    AppText(
                        modifier = Modifier,
                        text = "Privacy Policy.",
                        color = AppColor.termsTextColor,
                        fontSize = 12.ssp,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 12.ssp,
                        textDecoration = TextDecoration.Underline
                    )
                }
            }
        }
    }
}

@Composable
fun isLandscape(): Boolean {
    val configuration = LocalConfiguration.current
    return configuration.orientation == Configuration.ORIENTATION_LANDSCAPE
}