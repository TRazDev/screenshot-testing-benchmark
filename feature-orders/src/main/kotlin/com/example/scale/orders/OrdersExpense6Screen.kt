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
public fun OrdersExpense6Screen() {
    AppScreen(
        title = "Pending expenses",
        tabs = listOf("Nearby", "Draft"),
        selectedTab = 1,
        selectedNav = 2,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Pending", "Archived", "Featured"), selected = 2)
            PersonRow(name = "Margaret Hamilton", detail = "Updated a few minutes ago")
            PersonRow(name = "Grace Hopper", detail = "Scheduled for tomorrow")
            PersonRow(name = "Radia Perlman", detail = "Updated a few minutes ago")
            PersonRow(name = "Barbara Liskov", detail = "Delivered to the London office")
            PersonRow(name = "Radia Perlman", detail = "Waiting on approval")

    }
}

@Preview
@Composable
internal fun OrdersExpense6ScreenPreview() {
    OrdersExpense6Screen()
}
