package com.example.scale.activity

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
public fun ActivityRecipe11Screen() {
    AppScreen(
        title = "Recipe details",
        selectedNav = 2,
        showFab = true,
    ) {

        InfoCard(
            title = "Weekly portfolio",
            body = "No changes since last week",
        )
        RatingStars(rating = 4, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Synced across your devices")
        TagRow(tags = listOf("Archived", "Featured", "Pending"))
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
internal fun ActivityRecipe11ScreenPreview() {
    ActivityRecipe11Screen()
}
