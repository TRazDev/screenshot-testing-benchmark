package com.example.scale.catalog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun CatalogBooking0Screen() {
    AppScreen(
        title = "Booking details",
        tabs = listOf("Shared", "Pending"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = false,
    ) {

        InfoCard(
            title = "Weekly lesson",
            body = "Synced across your devices",
        )
        RatingStars(rating = 2, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Scheduled for tomorrow")
        TagRow(tags = listOf("Weekly", "Archived", "Team"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun CatalogBooking0ScreenPreview() {
    CatalogBooking0Screen()
}
