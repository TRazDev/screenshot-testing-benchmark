package com.example.scale.support

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun SupportSubscription6Screen() {
    AppScreen(
        title = "Subscription details",
        tabs = listOf("Recent", "Draft"),
        selectedTab = 0,
        selectedNav = 1,
        showFab = false,
    ) {

        InfoCard(
            title = "Team route",
            body = "Scheduled for tomorrow",
        )
        RatingStars(rating = 5, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "No changes since last week")
        TagRow(tags = listOf("Pending", "Shared", "Shared"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun SupportSubscription6ScreenPreview() {
    SupportSubscription6Screen()
}
