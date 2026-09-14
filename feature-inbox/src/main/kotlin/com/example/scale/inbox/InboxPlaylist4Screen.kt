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
public fun InboxPlaylist4Screen() {
    AppScreen(
        title = "Playlist overview",
        selectedNav = 1,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Featured tasks", value = "607")
            StatCard(label = "Recent orders", value = "572")
            StatCard(label = "Archived reports", value = "656")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Habit summary", body = "Shared with three people")

    }
}

@Preview
@Composable
internal fun InboxPlaylist4ScreenPreview() {
    InboxPlaylist4Screen()
}
