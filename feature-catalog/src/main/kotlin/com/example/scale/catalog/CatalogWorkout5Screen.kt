package com.example.scale.catalog

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
public fun CatalogWorkout5Screen() {
    AppScreen(
        title = "Featured workouts",
        selectedNav = 2,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Draft", "Nearby", "Archived"), selected = 2)
            PersonRow(name = "Ken Thompson", detail = "Scheduled for tomorrow")
            PersonRow(name = "Ada Lovelace", detail = "Delivered to the London office")
            PersonRow(name = "Katherine Johnson", detail = "Shared with three people")
            PersonRow(name = "Barbara Liskov", detail = "No changes since last week")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun CatalogWorkout5ScreenPreview() {
    CatalogWorkout5Screen()
}
