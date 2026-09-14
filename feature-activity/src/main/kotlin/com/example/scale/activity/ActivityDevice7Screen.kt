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
public fun ActivityDevice7Screen() {
    AppScreen(
        title = "Device overview",
        selectedNav = 2,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Team tickets", value = "530")
            StatCard(label = "Team payments", value = "851")
            StatCard(label = "Nearby habits", value = "425")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Order summary", body = "Scheduled for tomorrow")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ActivityDevice7ScreenPreview() {
    ActivityDevice7Screen()
}
