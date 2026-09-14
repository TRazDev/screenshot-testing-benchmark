package com.example.scale.notes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun NotesPortfolio9Screen() {
    AppScreen(
        title = "New portfolio",
        tabs = listOf("Team", "Weekly"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Full name", value = "")
        LabelledField(label = "Address", value = "")
        LabelledField(label = "Note", value = "")
        LabelledField(label = "Phone", value = "")
        CheckRow(label = "Send me a copy", checked = false)
        ChoiceRow(label = "Standard delivery", selected = true)
        ChoiceRow(label = "Express delivery", selected = false)
        AmountSlider(value = 0.25f)
        PrimaryAction(label = "Submit", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun NotesPortfolio9ScreenPreview() {
    NotesPortfolio9Screen()
}
