package com.example.scale.storage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun StorageDevice11Screen() {
    AppScreen(
        title = "Team devices",
        selectedNav = 2,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Weekly", "Archived", "Recent"), selected = 1)
            PersonRow(name = "Radia Perlman", detail = "Scheduled for tomorrow")
            PersonRow(name = "Dennis Ritchie", detail = "Waiting on approval")
            PersonRow(name = "Ken Thompson", detail = "Scheduled for tomorrow")
            PersonRow(name = "Ada Lovelace", detail = "Shared with three people")
            PersonRow(name = "Katherine Johnson", detail = "Waiting on approval")

    }
}

@Preview
@Composable
internal fun StorageDevice11ScreenPreview() {
    StorageDevice11Screen()
}
