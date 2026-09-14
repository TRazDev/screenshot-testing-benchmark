package com.example.scale.activity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun ActivitySubscription12Screen() {
    AppScreen(
        title = "New subscription",
        tabs = listOf("Featured", "Archived"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = false,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Phone", value = "")
        LabelledField(label = "Address", value = "")
        LabelledField(label = "Email", value = "")
        CheckRow(label = "Send me a copy", checked = true)
        ChoiceRow(label = "Standard delivery", selected = true)
        ChoiceRow(label = "Express delivery", selected = false)
        AmountSlider(value = 0.5f)
        PrimaryAction(label = "Submit", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun ActivitySubscription12ScreenPreview() {
    ActivitySubscription12Screen()
}
