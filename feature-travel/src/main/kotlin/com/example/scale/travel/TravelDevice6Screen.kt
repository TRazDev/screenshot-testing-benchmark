package com.example.scale.travel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun TravelDevice6Screen() {
    AppScreen(
        title = "Draft devices",
        tabs = listOf("Recent", "Archived"),
        selectedTab = 1,
        selectedNav = 2,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Pending", "Shared", "Pending"), selected = 0)
            PersonRow(name = "Radia Perlman", detail = "Scheduled for tomorrow")
            PersonRow(name = "Ken Thompson", detail = "No changes since last week")
            PersonRow(name = "Barbara Liskov", detail = "Updated a few minutes ago")
            PersonRow(name = "Katherine Johnson", detail = "No changes since last week")
            PersonRow(name = "Barbara Liskov", detail = "Scheduled for tomorrow")

    }
}

@Preview
@Composable
internal fun TravelDevice6ScreenPreview() {
    TravelDevice6Screen()
}
