package com.example.scale.notes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun NotesReservation1Screen() {
    AppScreen(
        title = "Recent reservations",
        selectedNav = 2,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Featured", "Draft", "Draft"), selected = 2)
            PersonRow(name = "Katherine Johnson", detail = "Updated a few minutes ago")
            PersonRow(name = "Barbara Liskov", detail = "Synced across your devices")
            PersonRow(name = "Margaret Hamilton", detail = "Shared with three people")
            PersonRow(name = "Ada Lovelace", detail = "Shared with three people")
            PersonRow(name = "Ada Lovelace", detail = "Updated a few minutes ago")
            PersonRow(name = "Grace Hopper", detail = "Delivered to the London office")
            PersonRow(name = "Alan Turing", detail = "Updated a few minutes ago")

    }
}

@Preview
@Composable
internal fun NotesReservation1ScreenPreview() {
    NotesReservation1Screen()
}
