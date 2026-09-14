package com.example.scale.reports

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun ReportsReport0Screen() {
    AppScreen(
        title = "Report details",
        tabs = listOf("Nearby", "Featured"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = true,
    ) {

        InfoCard(
            title = "Team route",
            body = "No changes since last week",
        )
        RatingStars(rating = 2, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Synced across your devices")
        TagRow(tags = listOf("Featured", "Weekly", "Recent"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun ReportsReport0ScreenPreview() {
    ReportsReport0Screen()
}
