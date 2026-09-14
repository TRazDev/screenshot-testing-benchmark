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
public fun TasksReservation4Screen() {
    AppScreen(
        title = "Reservation overview",
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Archived subscriptions", value = "470")
            StatCard(label = "Recent bookings", value = "58")
            StatCard(label = "Draft articles", value = "338")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Project summary", body = "Synced across your devices")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun TasksReservation4ScreenPreview() {
    TasksReservation4Screen()
}
