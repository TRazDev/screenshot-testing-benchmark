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
public fun SettingsAlbum0Screen() {
    AppScreen(
        title = "New album",
        tabs = listOf("Weekly", "Recent"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Full name", value = "")
        LabelledField(label = "Address", value = "")
        LabelledField(label = "Note", value = "")
        LabelledField(label = "Email", value = "")
        CheckRow(label = "Send me a copy", checked = true)
        ChoiceRow(label = "Standard delivery", selected = true)
        ChoiceRow(label = "Express delivery", selected = false)
        AmountSlider(value = 0.25f)
        PrimaryAction(label = "Submit", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun SettingsAlbum0ScreenPreview() {
    SettingsAlbum0Screen()
}
