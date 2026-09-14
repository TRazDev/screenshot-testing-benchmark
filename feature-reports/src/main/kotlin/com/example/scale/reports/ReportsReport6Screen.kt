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
public fun ReportsReport6Screen() {
    AppScreen(
        title = "Report details",
        tabs = listOf("Draft", "Featured"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = true,
    ) {

        InfoCard(
            title = "Pending playlist",
            body = "Expires at the end of the month",
        )
        RatingStars(rating = 2, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Scheduled for tomorrow")
        TagRow(tags = listOf("Team", "Recent", "Nearby"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun ReportsReport6ScreenPreview() {
    ReportsReport6Screen()
}
