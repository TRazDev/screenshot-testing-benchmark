package com.example.scale.notes

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
public fun NotesAlbum4Screen() {
    AppScreen(
        title = "Album overview",
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Pending bookings", value = "418")
            StatCard(label = "Shared lessons", value = "496")
            StatCard(label = "Pending routes", value = "986")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Contact summary", body = "Updated a few minutes ago")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun NotesAlbum4ScreenPreview() {
    NotesAlbum4Screen()
}
