package com.example.scale.social

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun SocialAlbum6Screen() {
    AppScreen(
        title = "Team albums",
        tabs = listOf("Pending", "Nearby"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Archived", "Recent", "Draft"), selected = 2)
            PersonRow(name = "Dennis Ritchie", detail = "Shared with three people")
            PersonRow(name = "Linus Torvalds", detail = "No changes since last week")
            PersonRow(name = "Radia Perlman", detail = "Waiting on approval")
            PersonRow(name = "Linus Torvalds", detail = "Synced across your devices")
            PersonRow(name = "Grace Hopper", detail = "Expires at the end of the month")
            PersonRow(name = "Katherine Johnson", detail = "Expires at the end of the month")

    }
}

@Preview
@Composable
internal fun SocialAlbum6ScreenPreview() {
    SocialAlbum6Screen()
}
