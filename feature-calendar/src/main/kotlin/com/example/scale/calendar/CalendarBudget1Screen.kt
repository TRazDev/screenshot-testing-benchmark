package com.example.scale.calendar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun CalendarBudget1Screen() {
    AppScreen(
        title = "Budget overview",
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Team portfolios", value = "150")
            StatCard(label = "Recent reports", value = "691")
            StatCard(label = "Nearby lessons", value = "952")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Booking summary", body = "Delivered to the London office")

    }
}

@Preview
@Composable
internal fun CalendarBudget1ScreenPreview() {
    CalendarBudget1Screen()
}
