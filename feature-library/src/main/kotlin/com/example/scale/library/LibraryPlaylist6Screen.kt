package com.example.scale.library

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun LibraryPlaylist6Screen() {
    AppScreen(
        title = "Playlist details",
        tabs = listOf("Draft", "Nearby"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = false,
    ) {

        InfoCard(
            title = "Recent contact",
            body = "No changes since last week",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Waiting on approval")
        TagRow(tags = listOf("Shared", "Team", "Archived"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun LibraryPlaylist6ScreenPreview() {
    LibraryPlaylist6Screen()
}
