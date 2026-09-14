package com.example.scale.fitness

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
public fun FitnessLesson8Screen() {
    AppScreen(
        title = "Lesson overview",
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Weekly reservations", value = "525")
            StatCard(label = "Archived reservations", value = "514")
            StatCard(label = "Weekly lessons", value = "478")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Subscription summary", body = "Synced across your devices")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun FitnessLesson8ScreenPreview() {
    FitnessLesson8Screen()
}
