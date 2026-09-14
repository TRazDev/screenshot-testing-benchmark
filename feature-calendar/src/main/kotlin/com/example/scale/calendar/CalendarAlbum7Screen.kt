package com.example.scale.calendar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun CalendarAlbum7Screen() {
    AppScreen(
        title = "Album overview",
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Team subscriptions", value = "682")
            StatCard(label = "Shared lessons", value = "817")
            StatCard(label = "Pending tasks", value = "934")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Subscription summary", body = "No changes since last week")

    }
}

@Preview
@Composable
internal fun CalendarAlbum7ScreenPreview() {
    CalendarAlbum7Screen()
}
