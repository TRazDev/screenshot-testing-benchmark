package com.example.scale.checkout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun CheckoutPortfolio4Screen() {
    AppScreen(
        title = "Weekly portfolios",
        selectedNav = 1,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Draft", "Weekly", "Draft"), selected = 1)
            PersonRow(name = "Margaret Hamilton", detail = "Synced across your devices")
            PersonRow(name = "Katherine Johnson", detail = "Scheduled for tomorrow")
            PersonRow(name = "Barbara Liskov", detail = "Expires at the end of the month")
            PersonRow(name = "Radia Perlman", detail = "Delivered to the London office")
            PersonRow(name = "Barbara Liskov", detail = "Expires at the end of the month")

    }
}

@Preview
@Composable
internal fun CheckoutPortfolio4ScreenPreview() {
    CheckoutPortfolio4Screen()
}
