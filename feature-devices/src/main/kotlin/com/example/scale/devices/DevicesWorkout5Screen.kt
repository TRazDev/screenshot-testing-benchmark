package com.example.scale.devices

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun DevicesWorkout5Screen() {
    AppScreen(
        title = "Nearby workouts",
        selectedNav = 0,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Nearby", "Nearby", "Pending"), selected = 1)
            PersonRow(name = "Ken Thompson", detail = "Shared with three people")
            PersonRow(name = "Katherine Johnson", detail = "No changes since last week")
            PersonRow(name = "Linus Torvalds", detail = "Scheduled for tomorrow")
            PersonRow(name = "Alan Turing", detail = "Expires at the end of the month")
            PersonRow(name = "Grace Hopper", detail = "Synced across your devices")

    }
}

@Preview
@Composable
internal fun DevicesWorkout5ScreenPreview() {
    DevicesWorkout5Screen()
}
