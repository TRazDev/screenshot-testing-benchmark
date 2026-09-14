package com.example.scale.notes

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
public fun NotesRoute10Screen() {
    AppScreen(
        title = "Route overview",
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Pending expenses", value = "674")
            StatCard(label = "Nearby contacts", value = "481")
            StatCard(label = "Archived recipes", value = "640")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Playlist summary", body = "Shared with three people")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun NotesRoute10ScreenPreview() {
    NotesRoute10Screen()
}
