package com.example.scale.discover

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
public fun DiscoverRoute4Screen() {
    AppScreen(
        title = "Featured routes",
        selectedNav = 0,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Draft", "Draft", "Pending"), selected = 1)
            PersonRow(name = "Margaret Hamilton", detail = "Delivered to the London office")
            PersonRow(name = "Grace Hopper", detail = "Updated a few minutes ago")
            PersonRow(name = "Ken Thompson", detail = "No changes since last week")
            PersonRow(name = "Linus Torvalds", detail = "Shared with three people")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun DiscoverRoute4ScreenPreview() {
    DiscoverRoute4Screen()
}
