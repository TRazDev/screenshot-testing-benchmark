package com.example.scale.media

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun MediaPayment1Screen() {
    AppScreen(
        title = "Draft payments",
        selectedNav = 2,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Shared", "Team", "Team"), selected = 1)
            PersonRow(name = "Ken Thompson", detail = "Synced across your devices")
            PersonRow(name = "Ada Lovelace", detail = "Shared with three people")
            PersonRow(name = "Margaret Hamilton", detail = "Expires at the end of the month")
            PersonRow(name = "Alan Turing", detail = "Expires at the end of the month")

    }
}

@Preview
@Composable
internal fun MediaPayment1ScreenPreview() {
    MediaPayment1Screen()
}
