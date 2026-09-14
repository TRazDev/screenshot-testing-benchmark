package com.example.scale.support

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
public fun SupportWorkout5Screen() {
    AppScreen(
        title = "Team workouts",
        selectedNav = 3,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Featured", "Shared", "Team"), selected = 1)
            PersonRow(name = "Linus Torvalds", detail = "No changes since last week")
            PersonRow(name = "Margaret Hamilton", detail = "Waiting on approval")
            PersonRow(name = "Ken Thompson", detail = "Shared with three people")
            PersonRow(name = "Katherine Johnson", detail = "Expires at the end of the month")
            PersonRow(name = "Radia Perlman", detail = "Waiting on approval")
            PersonRow(name = "Grace Hopper", detail = "Delivered to the London office")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun SupportWorkout5ScreenPreview() {
    SupportWorkout5Screen()
}
