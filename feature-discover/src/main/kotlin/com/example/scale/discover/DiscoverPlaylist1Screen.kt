package com.example.scale.discover

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun DiscoverPlaylist1Screen() {
    AppScreen(
        title = "Playlist overview",
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Archived habits", value = "598")
            StatCard(label = "Draft tickets", value = "534")
            StatCard(label = "Recent devices", value = "707")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Lesson summary", body = "No changes since last week")

    }
}

@Preview
@Composable
internal fun DiscoverPlaylist1ScreenPreview() {
    DiscoverPlaylist1Screen()
}
