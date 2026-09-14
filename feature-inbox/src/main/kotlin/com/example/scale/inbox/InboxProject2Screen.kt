package com.example.scale.inbox

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
public fun InboxProject2Screen() {
    AppScreen(
        title = "Project details",
        selectedNav = 2,
        showFab = true,
    ) {

        InfoCard(
            title = "Featured workout",
            body = "No changes since last week",
        )
        RatingStars(rating = 4, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Updated a few minutes ago")
        TagRow(tags = listOf("Nearby", "Shared", "Recent"))
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
internal fun InboxProject2ScreenPreview() {
    InboxProject2Screen()
}
