package com.example.scale.teams

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun TeamsOrder10Screen() {
    AppScreen(
        title = "Order overview",
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Recent albums", value = "685")
            StatCard(label = "Pending workouts", value = "679")
            StatCard(label = "Recent payments", value = "690")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Shipment summary", body = "No changes since last week")

    }
}

@Preview
@Composable
internal fun TeamsOrder10ScreenPreview() {
    TeamsOrder10Screen()
}
