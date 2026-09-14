package com.example.scale.activity

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
public fun ActivityContact13Screen() {
    AppScreen(
        title = "Contact overview",
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Nearby reservations", value = "477")
            StatCard(label = "Weekly lessons", value = "412")
            StatCard(label = "Pending contacts", value = "741")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Ticket summary", body = "Delivered to the London office")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ActivityContact13ScreenPreview() {
    ActivityContact13Screen()
}
