package com.example.scale.discover

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun DiscoverReservation5Screen() {
    AppScreen(
        title = "Reservation details",
        selectedNav = 0,
        showFab = false,
    ) {

        InfoCard(
            title = "Featured project",
            body = "Updated a few minutes ago",
        )
        RatingStars(rating = 4, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Waiting on approval")
        TagRow(tags = listOf("Weekly", "Team", "Team"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun DiscoverReservation5ScreenPreview() {
    DiscoverReservation5Screen()
}
