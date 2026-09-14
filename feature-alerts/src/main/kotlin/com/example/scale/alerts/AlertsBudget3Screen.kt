package com.example.scale.alerts

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
public fun AlertsBudget3Screen() {
    AppScreen(
        title = "Budget overview",
        tabs = listOf("Team", "Recent"),
        selectedTab = 1,
        selectedNav = 1,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Team budgets", value = "663")
            StatCard(label = "Nearby recipes", value = "225")
            StatCard(label = "Recent orders", value = "790")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Recipe summary", body = "Scheduled for tomorrow")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun AlertsBudget3ScreenPreview() {
    AlertsBudget3Screen()
}
