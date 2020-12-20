package app.elite.seedplant.ui

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.sp
import app.elite.seedplant.R


val playFair = fontFamily(
        font(R.font.playfair_display),
        font(R.font.playfair_display_bold, FontWeight.Bold)
)

val typography = Typography(
        h4 = TextStyle(
                fontFamily = playFair,
                fontWeight = FontWeight.W600,
                fontSize = 30.sp
        ),
        h5 = TextStyle(
                fontFamily = playFair,
                fontWeight = FontWeight.W600,
                fontSize = 24.sp
        ),
        h6 = TextStyle(
                fontFamily = playFair,
                fontWeight = FontWeight.W600,
                fontSize = 20.sp
        ),
        subtitle1 = TextStyle(
                fontFamily = playFair,
                fontWeight = FontWeight.W600,
                fontSize = 16.sp
        ),
        subtitle2 = TextStyle(
                fontFamily = playFair,
                fontWeight = FontWeight.W500,
                fontSize = 14.sp
        ),
        body1 = TextStyle(
                fontFamily = playFair,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        ),
        body2 = TextStyle(
                fontFamily = playFair,
                fontSize = 14.sp
        ),
        button = TextStyle(
                fontFamily = playFair,
                fontWeight = FontWeight.W500,
                fontSize = 14.sp
        ),
        caption = TextStyle(
                fontFamily = playFair,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
        ),
        overline = TextStyle(
                fontFamily = playFair,
                fontWeight = FontWeight.W500,
                fontSize = 12.sp
        )
)