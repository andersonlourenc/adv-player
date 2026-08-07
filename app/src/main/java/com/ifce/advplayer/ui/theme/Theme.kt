package com.ifce.advplayer.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = AdvBlueLight,
    secondary = AdvBlue,
    tertiary = AdvBlueDark,
    background = AdvTextPrimary,
    surface = AdvTextPrimary,
    onPrimary = AdvTextPrimary,
    onSecondary = AdvSurface,
    onTertiary = AdvSurface,
    onBackground = AdvSurface,
    onSurface = AdvSurface
)

private val LightColorScheme = lightColorScheme(
    primary = AdvBlue,
    secondary = AdvBlueDark,
    tertiary = AdvBlueLight,
    background = AdvBackground,
    surface = AdvSurface,
    onPrimary = AdvSurface,
    onSecondary = AdvSurface,
    onTertiary = AdvTextPrimary,
    onBackground = AdvTextPrimary,
    onSurface = AdvTextPrimary
)

@Composable
fun ADVPlayerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}