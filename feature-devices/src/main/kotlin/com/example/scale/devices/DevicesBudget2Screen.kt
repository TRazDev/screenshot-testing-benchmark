package com.example.scale.devices

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
public fun DevicesBudget2Screen() {
    AppScreen(
        title = "Budget overview",
        selectedNav = 0,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Weekly articles", value = "654")
            StatCard(label = "Archived workouts", value = "431")
            StatCard(label = "Nearby orders", value = "42")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Project summary", body = "Updated a few minutes ago")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun DevicesBudget2ScreenPreview() {
    DevicesBudget2Screen()
}
