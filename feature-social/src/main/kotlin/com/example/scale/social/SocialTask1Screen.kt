package com.example.scale.social

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
public fun SocialTask1Screen() {
    AppScreen(
        title = "Task details",
        selectedNav = 0,
        showFab = true,
    ) {

        InfoCard(
            title = "Recent recipe",
            body = "No changes since last week",
        )
        RatingStars(rating = 5, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "No changes since last week")
        TagRow(tags = listOf("Nearby", "Recent", "Recent"))
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
internal fun SocialTask1ScreenPreview() {
    SocialTask1Screen()
}
