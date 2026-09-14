package com.example.scale.devices

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun DevicesProject6Screen() {
    AppScreen(
        title = "Project details",
        tabs = listOf("Pending", "Team"),
        selectedTab = 0,
        selectedNav = 1,
        showFab = false,
    ) {

        InfoCard(
            title = "Team article",
            body = "Updated a few minutes ago",
        )
        RatingStars(rating = 5, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Waiting on approval")
        TagRow(tags = listOf("Featured", "Pending", "Recent"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun DevicesProject6ScreenPreview() {
    DevicesProject6Screen()
}
