package com.example.scale.profile

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
public fun ProfileBooking0Screen() {
    AppScreen(
        title = "Booking details",
        tabs = listOf("Team", "Archived"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = true,
    ) {

        InfoCard(
            title = "Featured recipe",
            body = "Delivered to the London office",
        )
        RatingStars(rating = 5, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Shared with three people")
        TagRow(tags = listOf("Recent", "Archived", "Archived"))
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
internal fun ProfileBooking0ScreenPreview() {
    ProfileBooking0Screen()
}
