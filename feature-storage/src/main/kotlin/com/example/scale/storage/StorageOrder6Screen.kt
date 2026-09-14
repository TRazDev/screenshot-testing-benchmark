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
public fun StorageOrder6Screen() {
    AppScreen(
        title = "Order details",
        tabs = listOf("Recent", "Team"),
        selectedTab = 1,
        selectedNav = 2,
        showFab = true,
    ) {

        InfoCard(
            title = "Shared payment",
            body = "Expires at the end of the month",
        )
        RatingStars(rating = 5, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Synced across your devices")
        TagRow(tags = listOf("Nearby", "Pending", "Draft"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun StorageOrder6ScreenPreview() {
    StorageOrder6Screen()
}
