package com.example.scale.discover

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uk.co.fractalmotion.mugshot.annotations.Mugshot
import uk.co.fractalmotion.mugshot.annotations.MugshotMatrix
import com.example.scale.designsystem.*

@Composable
public fun DiscoverHabit0Screen() {
    AppScreen(
        title = "New habit",
        tabs = listOf("Team", "Team"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Note", value = "")
        LabelledField(label = "Email", value = "")
        LabelledField(label = "Reference", value = "")
        LabelledField(label = "Address", value = "")
        CheckRow(label = "Send me a copy", checked = true)
        ChoiceRow(label = "Standard delivery", selected = true)
        ChoiceRow(label = "Express delivery", selected = false)
        AmountSlider(value = 0.25f)
        PrimaryAction(label = "Submit", modifier = Modifier.padding(16.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun DiscoverHabit0ScreenPreview() {
    DiscoverHabit0Screen()
}
