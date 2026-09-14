package com.example.scale.library

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
public fun LibraryRecipe0Screen() {
    AppScreen(
        title = "Recipe details",
        tabs = listOf("Shared", "Pending"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = false,
    ) {

        InfoCard(
            title = "Recent article",
            body = "Shared with three people",
        )
        RatingStars(rating = 2, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Updated a few minutes ago")
        TagRow(tags = listOf("Team", "Weekly", "Pending"))
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
internal fun LibraryRecipe0ScreenPreview() {
    LibraryRecipe0Screen()
}
