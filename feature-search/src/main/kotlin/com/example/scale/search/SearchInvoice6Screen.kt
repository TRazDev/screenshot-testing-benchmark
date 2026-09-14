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
public fun SearchInvoice6Screen() {
    AppScreen(
        title = "Featured invoices",
        tabs = listOf("Weekly", "Pending"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Featured", "Team", "Nearby"), selected = 1)
            PersonRow(name = "Margaret Hamilton", detail = "Updated a few minutes ago")
            PersonRow(name = "Radia Perlman", detail = "Expires at the end of the month")
            PersonRow(name = "Katherine Johnson", detail = "Updated a few minutes ago")
            PersonRow(name = "Katherine Johnson", detail = "Delivered to the London office")
            PersonRow(name = "Radia Perlman", detail = "Expires at the end of the month")
            PersonRow(name = "Barbara Liskov", detail = "Waiting on approval")
            PersonRow(name = "Linus Torvalds", detail = "Expires at the end of the month")

    }
}

@Preview
@Composable
internal fun SearchInvoice6ScreenPreview() {
    SearchInvoice6Screen()
}
