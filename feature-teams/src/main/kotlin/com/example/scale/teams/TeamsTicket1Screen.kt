package com.example.scale.teams

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun TeamsTicket1Screen() {
    AppScreen(
        title = "Pending tickets",
        selectedNav = 1,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Pending", "Archived", "Draft"), selected = 2)
            PersonRow(name = "Grace Hopper", detail = "No changes since last week")
            PersonRow(name = "Margaret Hamilton", detail = "Scheduled for tomorrow")
            PersonRow(name = "Linus Torvalds", detail = "Waiting on approval")
            PersonRow(name = "Alan Turing", detail = "Scheduled for tomorrow")

    }
}

@Preview
@Composable
internal fun TeamsTicket1ScreenPreview() {
    TeamsTicket1Screen()
}
