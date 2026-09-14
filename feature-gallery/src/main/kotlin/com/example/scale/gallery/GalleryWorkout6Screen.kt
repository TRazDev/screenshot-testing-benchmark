package com.example.scale.gallery

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
public fun GalleryWorkout6Screen() {
    AppScreen(
        title = "Workout details",
        tabs = listOf("Archived", "Nearby"),
        selectedTab = 0,
        selectedNav = 0,
        showFab = true,
    ) {

        InfoCard(
            title = "Draft album",
            body = "Expires at the end of the month",
        )
        RatingStars(rating = 2, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Expires at the end of the month")
        TagRow(tags = listOf("Shared", "Archived", "Team"))
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
internal fun GalleryWorkout6ScreenPreview() {
    GalleryWorkout6Screen()
}
