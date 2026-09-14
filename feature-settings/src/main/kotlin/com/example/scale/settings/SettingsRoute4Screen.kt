package com.example.scale.settings

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
public fun SettingsRoute4Screen() {
    AppScreen(
        title = "Featured routes",
        selectedNav = 2,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Nearby", "Featured", "Archived"), selected = 0)
            PersonRow(name = "Ada Lovelace", detail = "No changes since last week")
            PersonRow(name = "Alan Turing", detail = "Waiting on approval")
            PersonRow(name = "Dennis Ritchie", detail = "Waiting on approval")
            PersonRow(name = "Margaret Hamilton", detail = "Expires at the end of the month")
            PersonRow(name = "Ken Thompson", detail = "Waiting on approval")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun SettingsRoute4ScreenPreview() {
    SettingsRoute4Screen()
}
