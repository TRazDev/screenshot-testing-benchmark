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
public fun ActivityShipment10Screen() {
    AppScreen(
        title = "Pending shipments",
        selectedNav = 2,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Draft", "Featured", "Draft"), selected = 1)
            PersonRow(name = "Ada Lovelace", detail = "Updated a few minutes ago")
            PersonRow(name = "Linus Torvalds", detail = "Delivered to the London office")
            PersonRow(name = "Ken Thompson", detail = "Waiting on approval")
            PersonRow(name = "Margaret Hamilton", detail = "Waiting on approval")

    }
}

@Preview
@Composable
internal fun ActivityShipment10ScreenPreview() {
    ActivityShipment10Screen()
}
