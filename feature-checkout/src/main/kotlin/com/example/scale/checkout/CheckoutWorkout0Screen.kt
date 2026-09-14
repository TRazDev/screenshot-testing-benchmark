package com.example.scale.checkout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun CheckoutWorkout0Screen() {
    AppScreen(
        title = "New workout",
        tabs = listOf("Nearby", "Featured"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = true,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Phone", value = "")
        LabelledField(label = "Address", value = "")
        CheckRow(label = "Send me a copy", checked = false)
        ChoiceRow(label = "Standard delivery", selected = true)
        ChoiceRow(label = "Express delivery", selected = false)
        AmountSlider(value = 0.5f)
        PrimaryAction(label = "Submit", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun CheckoutWorkout0ScreenPreview() {
    CheckoutWorkout0Screen()
}
