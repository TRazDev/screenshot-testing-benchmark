package com.example.scale.calendar

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
public fun CalendarWorkout6Screen() {
    AppScreen(
        title = "New workout",
        tabs = listOf("Nearby", "Draft"),
        selectedTab = 0,
        selectedNav = 2,
        showFab = true,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Address", value = "")
        LabelledField(label = "Full name", value = "")
        CheckRow(label = "Send me a copy", checked = false)
        ChoiceRow(label = "Standard delivery", selected = true)
        ChoiceRow(label = "Express delivery", selected = false)
        AmountSlider(value = 0.75f)
        PrimaryAction(label = "Submit", modifier = Modifier.padding(16.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun CalendarWorkout6ScreenPreview() {
    CalendarWorkout6Screen()
}
