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
public fun CheckoutProject10Screen() {
    AppScreen(
        title = "Pending projects",
        selectedNav = 1,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Pending", "Weekly", "Team"), selected = 1)
            PersonRow(name = "Dennis Ritchie", detail = "Shared with three people")
            PersonRow(name = "Margaret Hamilton", detail = "No changes since last week")
            PersonRow(name = "Ken Thompson", detail = "Updated a few minutes ago")
            PersonRow(name = "Alan Turing", detail = "Updated a few minutes ago")
            PersonRow(name = "Katherine Johnson", detail = "No changes since last week")

    }
}

@Preview
@Composable
internal fun CheckoutProject10ScreenPreview() {
    CheckoutProject10Screen()
}
