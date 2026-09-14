package com.example.scale.gallery

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
public fun GalleryBooking8Screen() {
    AppScreen(
        title = "Booking overview",
        selectedNav = 0,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Pending albums", value = "531")
            StatCard(label = "Archived shipments", value = "743")
            StatCard(label = "Draft contacts", value = "846")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Ticket summary", body = "Synced across your devices")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun GalleryBooking8ScreenPreview() {
    GalleryBooking8Screen()
}
