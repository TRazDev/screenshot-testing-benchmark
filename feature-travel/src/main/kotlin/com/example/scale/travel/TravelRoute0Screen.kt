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
public fun TravelRoute0Screen() {
    AppScreen(
        title = "Team routes",
        tabs = listOf("Featured", "Nearby"),
        selectedTab = 0,
        selectedNav = 2,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Weekly", "Pending", "Team"), selected = 1)
            PersonRow(name = "Ada Lovelace", detail = "Scheduled for tomorrow")
            PersonRow(name = "Linus Torvalds", detail = "Scheduled for tomorrow")
            PersonRow(name = "Barbara Liskov", detail = "Delivered to the London office")
            PersonRow(name = "Linus Torvalds", detail = "Shared with three people")
            PersonRow(name = "Radia Perlman", detail = "Synced across your devices")

    }
}

@Preview
@Composable
internal fun TravelRoute0ScreenPreview() {
    TravelRoute0Screen()
}
