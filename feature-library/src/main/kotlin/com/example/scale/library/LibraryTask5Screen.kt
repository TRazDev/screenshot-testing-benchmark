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
public fun LibraryTask5Screen() {
    AppScreen(
        title = "Archived tasks",
        selectedNav = 0,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Pending", "Shared", "Weekly"), selected = 1)
            PersonRow(name = "Ada Lovelace", detail = "Expires at the end of the month")
            PersonRow(name = "Linus Torvalds", detail = "Synced across your devices")
            PersonRow(name = "Grace Hopper", detail = "Expires at the end of the month")
            PersonRow(name = "Margaret Hamilton", detail = "Delivered to the London office")
            PersonRow(name = "Linus Torvalds", detail = "No changes since last week")
            PersonRow(name = "Grace Hopper", detail = "Scheduled for tomorrow")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun LibraryTask5ScreenPreview() {
    LibraryTask5Screen()
}
