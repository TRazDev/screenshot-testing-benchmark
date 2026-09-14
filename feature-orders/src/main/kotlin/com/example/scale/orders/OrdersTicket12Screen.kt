package com.example.scale.orders

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun OrdersTicket12Screen() {
    AppScreen(
        title = "Weekly tickets",
        tabs = listOf("Nearby", "Draft"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Team", "Team", "Weekly"), selected = 0)
            PersonRow(name = "Dennis Ritchie", detail = "Scheduled for tomorrow")
            PersonRow(name = "Alan Turing", detail = "Waiting on approval")
            PersonRow(name = "Barbara Liskov", detail = "Shared with three people")
            PersonRow(name = "Katherine Johnson", detail = "Waiting on approval")
            PersonRow(name = "Grace Hopper", detail = "Waiting on approval")

    }
}

@Preview
@Composable
internal fun OrdersTicket12ScreenPreview() {
    OrdersTicket12Screen()
}
