package org.monocode.material.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import org.monocode.lib.ThemeId
import org.monocode.lib.getMaterialMonoCode


@Composable
fun MonoCodeMaterialTheme(
    themeId: ThemeId,
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = getMaterialMonoCode(themeId),
//        colorScheme = dynamicLightColorScheme(LocalContext.current),
        typography = Typography,
        content = content
    )
}