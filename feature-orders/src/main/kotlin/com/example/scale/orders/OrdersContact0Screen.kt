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
public fun OrdersContact0Screen() {
    AppScreen(
        title = "Nearby contacts",
        tabs = listOf("Nearby", "Shared"),
        selectedTab = 0,
        selectedNav = 2,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Archived", "Nearby", "Pending"), selected = 1)
            PersonRow(name = "Barbara Liskov", detail = "Waiting on approval")
            PersonRow(name = "Ada Lovelace", detail = "Waiting on approval")
            PersonRow(name = "Dennis Ritchie", detail = "Expires at the end of the month")
            PersonRow(name = "Dennis Ritchie", detail = "Scheduled for tomorrow")

    }
}

@Preview
@Composable
internal fun OrdersContact0ScreenPreview() {
    OrdersContact0Screen()
}
