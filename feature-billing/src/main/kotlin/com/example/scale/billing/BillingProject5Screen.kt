package com.example.scale.billing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun BillingProject5Screen() {
    AppScreen(
        title = "Pending projects",
        selectedNav = 1,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Archived", "Nearby", "Pending"), selected = 0)
            PersonRow(name = "Linus Torvalds", detail = "Scheduled for tomorrow")
            PersonRow(name = "Barbara Liskov", detail = "Shared with three people")
            PersonRow(name = "Margaret Hamilton", detail = "Synced across your devices")
            PersonRow(name = "Barbara Liskov", detail = "Scheduled for tomorrow")
            PersonRow(name = "Barbara Liskov", detail = "Updated a few minutes ago")

    }
}

@Preview
@Composable
internal fun BillingProject5ScreenPreview() {
    BillingProject5Screen()
}
