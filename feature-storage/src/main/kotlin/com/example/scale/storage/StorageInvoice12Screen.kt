package com.example.scale.storage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun StorageInvoice12Screen() {
    AppScreen(
        title = "Invoice details",
        tabs = listOf("Recent", "Archived"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = false,
    ) {

        InfoCard(
            title = "Team invoice",
            body = "Expires at the end of the month",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Waiting on approval")
        TagRow(tags = listOf("Archived", "Weekly", "Weekly"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun StorageInvoice12ScreenPreview() {
    StorageInvoice12Screen()
}
