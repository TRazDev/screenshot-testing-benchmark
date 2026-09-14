package com.example.scale.fitness

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun FitnessHabit6Screen() {
    AppScreen(
        title = "Habit details",
        tabs = listOf("Draft", "Shared"),
        selectedTab = 1,
        selectedNav = 2,
        showFab = true,
    ) {

        InfoCard(
            title = "Archived habit",
            body = "Delivered to the London office",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Expires at the end of the month")
        TagRow(tags = listOf("Featured", "Draft", "Shared"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun FitnessHabit6ScreenPreview() {
    FitnessHabit6Screen()
}
