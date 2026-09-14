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
public fun NotesDevice8Screen() {
    AppScreen(
        title = "Device details",
        selectedNav = 0,
        showFab = false,
    ) {

        InfoCard(
            title = "Shared workout",
            body = "Synced across your devices",
        )
        RatingStars(rating = 2, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Scheduled for tomorrow")
        TagRow(tags = listOf("Draft", "Pending", "Recent"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun NotesDevice8ScreenPreview() {
    NotesDevice8Screen()
}
