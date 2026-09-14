package com.example.scale.alerts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun AlertsInvoice0Screen() {
    AppScreen(
        title = "Recent invoices",
        tabs = listOf("Shared", "Archived"),
        selectedTab = 1,
        selectedNav = 3,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Team", "Archived", "Shared"), selected = 0)
            PersonRow(name = "Alan Turing", detail = "Shared with three people")
            PersonRow(name = "Radia Perlman", detail = "Delivered to the London office")
            PersonRow(name = "Linus Torvalds", detail = "Synced across your devices")
            PersonRow(name = "Ada Lovelace", detail = "Synced across your devices")
            PersonRow(name = "Ken Thompson", detail = "Expires at the end of the month")
            PersonRow(name = "Dennis Ritchie", detail = "Scheduled for tomorrow")

    }
}

@Preview
@Composable
internal fun AlertsInvoice0ScreenPreview() {
    AlertsInvoice0Screen()
}
