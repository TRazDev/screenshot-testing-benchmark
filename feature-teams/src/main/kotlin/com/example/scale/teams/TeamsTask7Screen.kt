package com.example.scale.teams

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
public fun TeamsTask7Screen() {
    AppScreen(
        title = "Weekly tasks",
        selectedNav = 0,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Featured", "Featured", "Draft"), selected = 2)
            PersonRow(name = "Katherine Johnson", detail = "No changes since last week")
            PersonRow(name = "Ada Lovelace", detail = "Shared with three people")
            PersonRow(name = "Katherine Johnson", detail = "Shared with three people")
            PersonRow(name = "Ken Thompson", detail = "No changes since last week")
            PersonRow(name = "Grace Hopper", detail = "Scheduled for tomorrow")
            PersonRow(name = "Linus Torvalds", detail = "Delivered to the London office")
            PersonRow(name = "Radia Perlman", detail = "Shared with three people")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun TeamsTask7ScreenPreview() {
    TeamsTask7Screen()
}
