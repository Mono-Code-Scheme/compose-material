package org.monocode.lib

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt
import org.monocode.scheme.scheme.ColorId
import org.monocode.scheme.scheme.getLynxColor
import org.monocode.scheme.scheme.getPantherColor
import org.monocode.scheme.scheme.Color as MonoColor

private fun MonoColor.toColor(): Color {
    return Color(this.hex.toColorInt())
}

private fun getMaterialPanther(accent: MonoColor): ColorScheme {
    val n0Color = getPantherColor(ColorId.N0).toColor()
    val n1Color = getPantherColor(ColorId.N1).toColor()
    val n2Color = getPantherColor(ColorId.N2).toColor()
    val n3Color = getPantherColor(ColorId.N3).toColor()
    val n4Color = getPantherColor(ColorId.N4).toColor()
    val t0Color = getPantherColor(ColorId.T0).toColor()
    val accentColor = accent.toColor()
    val redColor = getPantherColor(ColorId.Red).toColor()

    val factor = 0.6f
    val darkerAccentColor = accentColor.copy(
        red = accentColor.red * factor,
        green = accentColor.green * factor,
        blue = accentColor.blue * factor
    )

    val darkerErrorColor = redColor.copy(
        red = redColor.red * factor,
        green = redColor.green * factor,
        blue = redColor.blue * factor
    )

    return lightColorScheme(
        // Accent Colors
        primary = accentColor,
        onPrimary = n0Color,
        primaryContainer = darkerAccentColor,
        onPrimaryContainer = n0Color,

        inversePrimary = accentColor,

        secondary = accentColor,
        onSecondary = n0Color,
        secondaryContainer = darkerAccentColor,
        onSecondaryContainer = n0Color,

        tertiary = accentColor,
        onTertiary = n0Color,
        tertiaryContainer = darkerAccentColor,
        onTertiaryContainer = n0Color,

        error = redColor,
        onError = n0Color,
        errorContainer = darkerErrorColor,
        onErrorContainer = n0Color,

        // Neutral Colors
        background = n2Color,
        onBackground = t0Color,

        surface = n2Color,
        surfaceTint = n2Color,
        surfaceBright = n2Color,
        surfaceDim = n4Color,
        surfaceContainerLowest = n0Color,
        surfaceContainerLow = n1Color,
        surfaceContainer = n2Color,
        surfaceContainerHigh = n3Color,
        surfaceContainerHighest = n4Color,
        onSurface = t0Color,

        inverseSurface = t0Color,
        inverseOnSurface = n2Color,

        surfaceVariant = n3Color,
        onSurfaceVariant = t0Color,

        outline = n3Color,
        outlineVariant = n4Color,

        scrim = Color.Black,
    )
}

private fun getMaterialLynx(accent: MonoColor): ColorScheme {
    val n0Color = getLynxColor(ColorId.N0).toColor()
    val n1Color = getLynxColor(ColorId.N1).toColor()
    val n2Color = getLynxColor(ColorId.N2).toColor()
    val n3Color = getLynxColor(ColorId.N3).toColor()
    val n4Color = getLynxColor(ColorId.N4).toColor()
    val t0Color = getLynxColor(ColorId.T0).toColor()
    val accentColor = accent.toColor()
    val redColor = getLynxColor(ColorId.Red).toColor()

    val factor = 0.4f
    val darkerAccentColor = accentColor.copy(
        red = accentColor.red * factor,
        green = accentColor.green * factor,
        blue = accentColor.blue * factor
    )

    val darkerErrorColor = redColor.copy(
        red = redColor.red * factor,
        green = redColor.green * factor,
        blue = redColor.blue * factor
    )

    return lightColorScheme(
        // Accent Colors
        primary = accentColor,
        onPrimary = n0Color,
        primaryContainer = darkerAccentColor,
        onPrimaryContainer = n0Color,

        inversePrimary = accentColor,

        secondary = accentColor,
        onSecondary = n0Color,
        secondaryContainer = darkerAccentColor,
        onSecondaryContainer = n0Color,

        tertiary = accentColor,
        onTertiary = n0Color,
        tertiaryContainer = darkerAccentColor,
        onTertiaryContainer = n0Color,

        error = redColor,
        onError = n0Color,
        errorContainer = darkerErrorColor,
        onErrorContainer = n0Color,

        // Neutral Colors
        background = n2Color,
        onBackground = t0Color,

        surface = n2Color,
        surfaceTint = n2Color,
        surfaceBright = n2Color,
        surfaceDim = n4Color,
        surfaceContainerLowest = n0Color,
        surfaceContainerLow = n1Color,
        surfaceContainer = n2Color,
        surfaceContainerHigh = n3Color,
        surfaceContainerHighest = n4Color,
        onSurface = t0Color,

        inverseSurface = t0Color,
        inverseOnSurface = n2Color,

        surfaceVariant = n3Color,
        onSurfaceVariant = t0Color,

        outline = n3Color,
        outlineVariant = n4Color,

        scrim = Color.Black,
    )
}

fun getMaterialMonoCode(themeId: ThemeId): ColorScheme {
    return when (themeId) {
        ThemeId.PantherRed -> getMaterialPanther(getPantherColor(ColorId.Red))
        ThemeId.PantherOrange -> getMaterialPanther(getPantherColor(ColorId.Orange))
        ThemeId.PantherYellow -> getMaterialPanther(getPantherColor(ColorId.Yellow))
        ThemeId.PantherGreen -> getMaterialPanther(getPantherColor(ColorId.Green))
        ThemeId.PantherNeonGreen -> getMaterialPanther(getPantherColor(ColorId.NeonGreen))
        ThemeId.PantherBlue -> getMaterialPanther(getPantherColor(ColorId.Blue))
        ThemeId.PantherCyan -> getMaterialPanther(getPantherColor(ColorId.Cyan))
        ThemeId.PantherPurple -> getMaterialPanther(getPantherColor(ColorId.Purple))
        ThemeId.PantherPink -> getMaterialPanther(getPantherColor(ColorId.Pink))
        ThemeId.LynxRed -> getMaterialLynx(getLynxColor(ColorId.Red))
        ThemeId.LynxOrange -> getMaterialLynx(getLynxColor(ColorId.Orange))
        ThemeId.LynxYellow -> getMaterialLynx(getLynxColor(ColorId.Yellow))
        ThemeId.LynxGreen -> getMaterialLynx(getLynxColor(ColorId.Green))
        ThemeId.LynxNeonGreen -> getMaterialLynx(getLynxColor(ColorId.NeonGreen))
        ThemeId.LynxBlue -> getMaterialLynx(getLynxColor(ColorId.Blue))
        ThemeId.LynxCyan -> getMaterialLynx(getLynxColor(ColorId.Cyan))
        ThemeId.LynxPurple -> getMaterialLynx(getLynxColor(ColorId.Purple))
        ThemeId.LynxPink -> getMaterialLynx(getLynxColor(ColorId.Pink))
    }
}
