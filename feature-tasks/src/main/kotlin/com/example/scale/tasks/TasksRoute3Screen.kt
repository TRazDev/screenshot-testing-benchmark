package com.example.scale.tasks

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
public fun TasksRoute3Screen() {
    AppScreen(
        title = "New route",
        tabs = listOf("Shared", "Nearby"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Note", value = "")
        LabelledField(label = "Full name", value = "")
        LabelledField(label = "Address", value = "")
        LabelledField(label = "Phone", value = "")
        CheckRow(label = "Send me a copy", checked = true)
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
internal fun TasksRoute3ScreenPreview() {
    TasksRoute3Screen()
}
