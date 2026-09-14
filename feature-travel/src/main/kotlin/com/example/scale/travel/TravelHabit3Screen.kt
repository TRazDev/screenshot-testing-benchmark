package com.example.scale.travel

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
public fun TravelHabit3Screen() {
    AppScreen(
        title = "Habit overview",
        tabs = listOf("Nearby", "Weekly"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Pending playlists", value = "839")
            StatCard(label = "Pending tickets", value = "455")
            StatCard(label = "Weekly reports", value = "228")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Budget summary", body = "Waiting on approval")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun TravelHabit3ScreenPreview() {
    TravelHabit3Screen()
}
