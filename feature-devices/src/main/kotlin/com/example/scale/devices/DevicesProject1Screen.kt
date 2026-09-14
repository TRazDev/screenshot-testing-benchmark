package com.example.scale.devices

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun DevicesProject1Screen() {
    AppScreen(
        title = "New project",
        selectedNav = 2,
        showFab = true,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Full name", value = "")
        LabelledField(label = "Email", value = "")
        LabelledField(label = "Note", value = "")
        LabelledField(label = "Reference", value = "")
        CheckRow(label = "Send me a copy", checked = true)
        ChoiceRow(label = "Standard delivery", selected = true)
        ChoiceRow(label = "Express delivery", selected = false)
        AmountSlider(value = 0.25f)
        PrimaryAction(label = "Submit", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun DevicesProject1ScreenPreview() {
    DevicesProject1Screen()
}
