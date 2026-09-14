package com.example.scale.fitness

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun FitnessContact2Screen() {
    AppScreen(
        title = "Contact overview",
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Team articles", value = "64")
            StatCard(label = "Draft workouts", value = "27")
            StatCard(label = "Draft subscriptions", value = "423")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Payment summary", body = "Scheduled for tomorrow")

    }
}

@Preview
@Composable
internal fun FitnessContact2ScreenPreview() {
    FitnessContact2Screen()
}
