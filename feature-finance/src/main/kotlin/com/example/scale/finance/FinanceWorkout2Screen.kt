package com.example.scale.finance

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun FinanceWorkout2Screen() {
    AppScreen(
        title = "Workout overview",
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Archived articles", value = "216")
            StatCard(label = "Draft reservations", value = "7")
            StatCard(label = "Shared tasks", value = "380")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Shipment summary", body = "Waiting on approval")

    }
}

@Preview
@Composable
internal fun FinanceWorkout2ScreenPreview() {
    FinanceWorkout2Screen()
}
