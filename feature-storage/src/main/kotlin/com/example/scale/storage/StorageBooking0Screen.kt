package com.example.scale.storage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uk.co.fractalmotion.mugshot.annotations.Mugshot
import uk.co.fractalmotion.mugshot.annotations.MugshotMatrix
import com.example.scale.designsystem.*

@Composable
public fun StorageBooking0Screen() {
    AppScreen(
        title = "Booking details",
        tabs = listOf("Archived", "Archived"),
        selectedTab = 1,
        selectedNav = 3,
        showFab = false,
    ) {

        InfoCard(
            title = "Recent recipe",
            body = "Shared with three people",
        )
        RatingStars(rating = 5, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Synced across your devices")
        TagRow(tags = listOf("Team", "Recent", "Nearby"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun StorageBooking0ScreenPreview() {
    StorageBooking0Screen()
}
