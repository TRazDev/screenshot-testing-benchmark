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
public fun DevicesAlbum8Screen() {
    AppScreen(
        title = "Album overview",
        selectedNav = 0,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Pending reports", value = "281")
            StatCard(label = "Team devices", value = "893")
            StatCard(label = "Weekly subscriptions", value = "773")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Ticket summary", body = "Scheduled for tomorrow")

    }
}

@Preview
@Composable
internal fun DevicesAlbum8ScreenPreview() {
    DevicesAlbum8Screen()
}
