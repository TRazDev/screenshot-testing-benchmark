package com.example.scale.media

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
public fun MediaOrder2Screen() {
    AppScreen(
        title = "Order details",
        selectedNav = 0,
        showFab = true,
    ) {

        InfoCard(
            title = "Pending payment",
            body = "Synced across your devices",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Expires at the end of the month")
        TagRow(tags = listOf("Shared", "Nearby", "Draft"))
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
internal fun MediaOrder2ScreenPreview() {
    MediaOrder2Screen()
}
