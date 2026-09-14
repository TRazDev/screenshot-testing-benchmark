package com.example.scale.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun SettingsAlbum6Screen() {
    AppScreen(
        title = "New album",
        tabs = listOf("Archived", "Draft"),
        selectedTab = 1,
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Address", value = "")
        LabelledField(label = "Note", value = "")
        LabelledField(label = "Email", value = "")
        LabelledField(label = "Phone", value = "")
        CheckRow(label = "Send me a copy", checked = true)
        ChoiceRow(label = "Standard delivery", selected = true)
        ChoiceRow(label = "Express delivery", selected = false)
        AmountSlider(value = 0.25f)
        PrimaryAction(label = "Submit", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun SettingsAlbum6ScreenPreview() {
    SettingsAlbum6Screen()
}
