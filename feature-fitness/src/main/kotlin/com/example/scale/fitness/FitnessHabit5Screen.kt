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
public fun FitnessHabit5Screen() {
    AppScreen(
        title = "Weekly habits",
        selectedNav = 1,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Shared", "Draft", "Featured"), selected = 2)
            PersonRow(name = "Linus Torvalds", detail = "Updated a few minutes ago")
            PersonRow(name = "Ada Lovelace", detail = "Scheduled for tomorrow")
            PersonRow(name = "Katherine Johnson", detail = "Shared with three people")
            PersonRow(name = "Katherine Johnson", detail = "No changes since last week")

    }
}

@Preview
@Composable
internal fun FitnessHabit5ScreenPreview() {
    FitnessHabit5Screen()
}
