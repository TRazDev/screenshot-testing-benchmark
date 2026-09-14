package com.example.scale.tasks

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
public fun TasksSubscription1Screen() {
    AppScreen(
        title = "Archived subscriptions",
        selectedNav = 3,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Nearby", "Shared", "Archived"), selected = 0)
            PersonRow(name = "Ken Thompson", detail = "Synced across your devices")
            PersonRow(name = "Katherine Johnson", detail = "Scheduled for tomorrow")
            PersonRow(name = "Katherine Johnson", detail = "Synced across your devices")
            PersonRow(name = "Barbara Liskov", detail = "Delivered to the London office")
            PersonRow(name = "Ken Thompson", detail = "Delivered to the London office")
            PersonRow(name = "Dennis Ritchie", detail = "Shared with three people")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun TasksSubscription1ScreenPreview() {
    TasksSubscription1Screen()
}
