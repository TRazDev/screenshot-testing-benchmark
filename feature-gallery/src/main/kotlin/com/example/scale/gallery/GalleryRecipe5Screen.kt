package com.example.scale.gallery

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun GalleryRecipe5Screen() {
    AppScreen(
        title = "Nearby recipes",
        selectedNav = 1,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Archived", "Featured", "Team"), selected = 2)
            PersonRow(name = "Ada Lovelace", detail = "Delivered to the London office")
            PersonRow(name = "Barbara Liskov", detail = "No changes since last week")
            PersonRow(name = "Linus Torvalds", detail = "Delivered to the London office")
            PersonRow(name = "Katherine Johnson", detail = "Synced across your devices")

    }
}

@Preview
@Composable
internal fun GalleryRecipe5ScreenPreview() {
    GalleryRecipe5Screen()
}
