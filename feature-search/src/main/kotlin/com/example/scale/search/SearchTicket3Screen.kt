package com.example.scale.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun SearchTicket3Screen() {
    AppScreen(
        title = "Ticket overview",
        tabs = listOf("Archived", "Nearby"),
        selectedTab = 1,
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Draft reservations", value = "504")
            StatCard(label = "Draft payments", value = "911")
            StatCard(label = "Featured recipes", value = "415")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Shipment summary", body = "Waiting on approval")

    }
}

@Preview
@Composable
internal fun SearchTicket3ScreenPreview() {
    SearchTicket3Screen()
}
