package com.example.scale.profile

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
public fun ProfileReservation8Screen() {
    AppScreen(
        title = "Reservation overview",
        selectedNav = 2,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Draft lessons", value = "708")
            StatCard(label = "Featured projects", value = "559")
            StatCard(label = "Archived bookings", value = "630")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Lesson summary", body = "Updated a few minutes ago")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ProfileReservation8ScreenPreview() {
    ProfileReservation8Screen()
}
