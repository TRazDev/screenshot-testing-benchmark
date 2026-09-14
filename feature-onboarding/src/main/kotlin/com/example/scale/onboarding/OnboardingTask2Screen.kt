package com.example.scale.onboarding

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
public fun OnboardingTask2Screen() {
    AppScreen(
        title = "Nearby tasks",
        selectedNav = 0,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Draft", "Pending", "Featured"), selected = 1)
            PersonRow(name = "Alan Turing", detail = "Updated a few minutes ago")
            PersonRow(name = "Margaret Hamilton", detail = "Scheduled for tomorrow")
            PersonRow(name = "Barbara Liskov", detail = "Updated a few minutes ago")
            PersonRow(name = "Linus Torvalds", detail = "Waiting on approval")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun OnboardingTask2ScreenPreview() {
    OnboardingTask2Screen()
}
