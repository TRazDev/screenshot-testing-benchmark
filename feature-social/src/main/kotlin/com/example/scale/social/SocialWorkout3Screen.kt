package com.example.scale.social

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
public fun SocialWorkout3Screen() {
    AppScreen(
        title = "Workout overview",
        tabs = listOf("Weekly", "Featured"),
        selectedTab = 0,
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Shared expenses", value = "319")
            StatCard(label = "Archived reservations", value = "68")
            StatCard(label = "Team albums", value = "103")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Subscription summary", body = "Shared with three people")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun SocialWorkout3ScreenPreview() {
    SocialWorkout3Screen()
}
