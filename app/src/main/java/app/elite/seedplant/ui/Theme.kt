package app.elite.seedplant.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val colorPalette = lightColors(
    primary = green900,
    primaryVariant = grey100,
    secondary = orange200
)

@Composable
fun SeedPlantTheme(content: @Composable() () -> Unit) {

    MaterialTheme(
        colors = colorPalette,
        typography = typography,
        shapes = shapes,
        content = content
    )
}