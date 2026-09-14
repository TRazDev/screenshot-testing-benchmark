package com.example.scale.inbox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun InboxContact1Screen() {
    AppScreen(
        title = "Shared contacts",
        selectedNav = 0,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Pending", "Team", "Shared"), selected = 2)
            PersonRow(name = "Barbara Liskov", detail = "Expires at the end of the month")
            PersonRow(name = "Alan Turing", detail = "No changes since last week")
            PersonRow(name = "Radia Perlman", detail = "Shared with three people")
            PersonRow(name = "Dennis Ritchie", detail = "Synced across your devices")
            PersonRow(name = "Radia Perlman", detail = "Scheduled for tomorrow")
            PersonRow(name = "Ken Thompson", detail = "No changes since last week")

    }
}

@Preview
@Composable
internal fun InboxContact1ScreenPreview() {
    InboxContact1Screen()
}
