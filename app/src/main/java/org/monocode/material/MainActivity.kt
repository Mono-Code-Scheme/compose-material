package org.monocode.material

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import org.monocode.material.ui.theme.MonoCodeMaterialTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.monocode.lib.ThemeId

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MonoCodeMaterialTheme(ThemeId.LynxYellow) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                        .systemBarsPadding()
                        .padding(24.dp)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        "Accent Colors",
                        color = MaterialTheme.colorScheme.onBackground,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Medium
                    )

                    ColorCard(
                        main = "Primary",
                        mainColor = MaterialTheme.colorScheme.primary,
                        onMain = "On Primary",
                        onMainColor = MaterialTheme.colorScheme.onPrimary
                    )

                    ColorCard(
                        main = "Primary Container",
                        mainColor = MaterialTheme.colorScheme.primaryContainer,
                        onMain = "On Primary Container",
                        onMainColor = MaterialTheme.colorScheme.onPrimaryContainer
                    )

                    ColorCard(
                        main = "Inverse Primary",
                        mainColor = MaterialTheme.colorScheme.inversePrimary,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.inversePrimary
                    )

                    ColorCard(
                        main = "Secondary",
                        mainColor = MaterialTheme.colorScheme.secondary,
                        onMain = "On Secondary",
                        onMainColor = MaterialTheme.colorScheme.onSecondary
                    )

                    ColorCard(
                        main = "Secondary Container",
                        mainColor = MaterialTheme.colorScheme.secondaryContainer,
                        onMain = "On Secondary Container",
                        onMainColor = MaterialTheme.colorScheme.onSecondaryContainer
                    )

                    ColorCard(
                        main = "Tertiary",
                        mainColor = MaterialTheme.colorScheme.tertiary,
                        onMain = "On Tertiary",
                        onMainColor = MaterialTheme.colorScheme.onTertiary
                    )

                    ColorCard(
                        main = "Tertiary Container",
                        mainColor = MaterialTheme.colorScheme.tertiaryContainer,
                        onMain = "On Tertiary Container",
                        onMainColor = MaterialTheme.colorScheme.onTertiaryContainer
                    )

                    ColorCard(
                        main = "Error",
                        mainColor = MaterialTheme.colorScheme.error,
                        onMain = "On Error",
                        onMainColor = MaterialTheme.colorScheme.onError
                    )

                    ColorCard(
                        main = "Error Container",
                        mainColor = MaterialTheme.colorScheme.errorContainer,
                        onMain = "On Error Container",
                        onMainColor = MaterialTheme.colorScheme.onErrorContainer
                    )

                    Spacer(Modifier.height(16.dp))

                    Text(
                        "Neutral Colors",
                        color = MaterialTheme.colorScheme.onBackground,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Medium
                    )

                    ColorCard(
                        main = "Background",
                        mainColor = MaterialTheme.colorScheme.background,
                        onMain = "On Background",
                        onMainColor = MaterialTheme.colorScheme.onBackground
                    )

                    ColorCard(
                        main = "Surface",
                        mainColor = MaterialTheme.colorScheme.surface,
                        onMain = "On Surface",
                        onMainColor = MaterialTheme.colorScheme.onSurface
                    )

                    ColorCard(
                        main = "Surface Tint",
                        mainColor = MaterialTheme.colorScheme.surfaceTint,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.surfaceTint
                    )

                    ColorCard(
                        main = "Surface Bright",
                        mainColor = MaterialTheme.colorScheme.surfaceBright,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.surfaceBright
                    )

                    ColorCard(
                        main = "Surface Dim",
                        mainColor = MaterialTheme.colorScheme.surfaceDim,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.surfaceDim
                    )

                    ColorCard(
                        main = "Surface Container Lowest",
                        mainColor = MaterialTheme.colorScheme.surfaceContainerLowest,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.surfaceContainerLowest
                    )


                    ColorCard(
                        main = "Surface Container Low",
                        mainColor = MaterialTheme.colorScheme.surfaceContainerLow,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.surfaceContainerLow
                    )

                    ColorCard(
                        main = "Surface Container",
                        mainColor = MaterialTheme.colorScheme.surfaceContainer,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.surfaceContainer
                    )

                    ColorCard(
                        main = "Surface Container High",
                        mainColor = MaterialTheme.colorScheme.surfaceContainerHigh,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.surfaceContainerHigh
                    )

                    ColorCard(
                        main = "Surface Container Highest",
                        mainColor = MaterialTheme.colorScheme.surfaceContainerHighest,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.surfaceContainerHighest
                    )

                    ColorCard(
                        main = "Inverse Surface",
                        mainColor = MaterialTheme.colorScheme.inverseSurface,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.inverseOnSurface
                    )

                    ColorCard(
                        main = "Surface Variant",
                        mainColor = MaterialTheme.colorScheme.surfaceVariant,
                        onMain = "On Surface Variant",
                        onMainColor = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    ColorCard(
                        main = "Outline",
                        mainColor = MaterialTheme.colorScheme.outline,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.outline
                    )

                    ColorCard(
                        main = "Outline Variant",
                        mainColor = MaterialTheme.colorScheme.outlineVariant,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.outlineVariant
                    )

                    ColorCard(
                        main = "Scrim",
                        mainColor = MaterialTheme.colorScheme.scrim,
                        onMain = "",
                        onMainColor = MaterialTheme.colorScheme.scrim
                    )

                    Spacer(Modifier.height(16.dp))

                    Text(
                        "Components",
                        color = MaterialTheme.colorScheme.onBackground,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Medium
                    )

                    var text = remember { mutableStateOf("") }

                    TextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = text.value,
                        onValueChange = { text.value = it },
                        placeholder = {
                            Text(
                                "Some Placeholder",
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        })

                    val checkBoxChecked = remember { mutableStateOf(false) }

                    Checkbox(
                        checked = checkBoxChecked.value,
                        onCheckedChange = { checkBoxChecked.value = it })

                    val switchChecked = remember { mutableStateOf(false) }

                    Switch(
                        checked = switchChecked.value,
                        onCheckedChange = { switchChecked.value = it })

                    CircularProgressIndicator()

                    LinearProgressIndicator(modifier = Modifier.fillMaxWidth())

                    val radioChecked = remember { mutableStateOf(false) }

                    RadioButton(
                        selected = radioChecked.value,
                        onClick = { radioChecked.value = !radioChecked.value })

                    val rangeValue = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = rangeValue.floatValue,
                        onValueChange = { rangeValue.floatValue = it }
                    )
                }
            }
        }
    }
}

@Composable
fun ColorCard(
    main: String,
    mainColor: Color,
    onMain: String,
    onMainColor: Color
) {
    Column {
        Text(main, color = MaterialTheme.colorScheme.onBackground)

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(CircleShape)
                .border(1.dp, MaterialTheme.colorScheme.onBackground, shape = CircleShape)
                .background(mainColor)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                onMain, color = onMainColor
            )
        }
    }
}