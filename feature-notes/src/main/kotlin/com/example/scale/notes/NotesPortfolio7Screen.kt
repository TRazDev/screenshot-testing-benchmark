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
public fun NotesPortfolio7Screen() {
    AppScreen(
        title = "Team portfolios",
        selectedNav = 3,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Recent", "Draft", "Archived"), selected = 1)
            PersonRow(name = "Katherine Johnson", detail = "Expires at the end of the month")
            PersonRow(name = "Grace Hopper", detail = "Waiting on approval")
            PersonRow(name = "Ken Thompson", detail = "Expires at the end of the month")
            PersonRow(name = "Radia Perlman", detail = "Scheduled for tomorrow")

    }
}

@Preview
@Composable
internal fun NotesPortfolio7ScreenPreview() {
    NotesPortfolio7Screen()
}
