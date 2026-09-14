package com.example.scale.inbox

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
public fun InboxArticle3Screen() {
    AppScreen(
        title = "New article",
        tabs = listOf("Featured", "Draft"),
        selectedTab = 0,
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Phone", value = "")
        LabelledField(label = "Note", value = "")
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
internal fun InboxArticle3ScreenPreview() {
    InboxArticle3Screen()
}
