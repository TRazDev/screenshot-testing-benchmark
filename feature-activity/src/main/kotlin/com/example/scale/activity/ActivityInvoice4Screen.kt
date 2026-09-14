package com.example.scale.activity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun ActivityInvoice4Screen() {
    AppScreen(
        title = "Recent invoices",
        selectedNav = 2,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Weekly", "Weekly", "Pending"), selected = 0)
            PersonRow(name = "Katherine Johnson", detail = "Synced across your devices")
            PersonRow(name = "Margaret Hamilton", detail = "No changes since last week")
            PersonRow(name = "Ada Lovelace", detail = "Synced across your devices")
            PersonRow(name = "Barbara Liskov", detail = "Updated a few minutes ago")
            PersonRow(name = "Margaret Hamilton", detail = "Waiting on approval")
            PersonRow(name = "Barbara Liskov", detail = "Waiting on approval")
            PersonRow(name = "Grace Hopper", detail = "Synced across your devices")

    }
}

@Preview
@Composable
internal fun ActivityInvoice4ScreenPreview() {
    ActivityInvoice4Screen()
}
