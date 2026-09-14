package com.example.scale.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun OnboardingRoute4Screen() {
    AppScreen(
        title = "New route",
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Email", value = "")
        LabelledField(label = "Full name", value = "")
        LabelledField(label = "Address", value = "")
        LabelledField(label = "Phone", value = "")
        CheckRow(label = "Send me a copy", checked = true)
        ChoiceRow(label = "Standard delivery", selected = true)
        ChoiceRow(label = "Express delivery", selected = false)
        AmountSlider(value = 0.5f)
        PrimaryAction(label = "Submit", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun OnboardingRoute4ScreenPreview() {
    OnboardingRoute4Screen()
}
