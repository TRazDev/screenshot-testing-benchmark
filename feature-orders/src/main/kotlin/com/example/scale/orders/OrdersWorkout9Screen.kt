package com.example.scale.orders

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun OrdersWorkout9Screen() {
    AppScreen(
        title = "Workout overview",
        tabs = listOf("Pending", "Shared"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Pending tickets", value = "918")
            StatCard(label = "Team invoices", value = "115")
            StatCard(label = "Weekly payments", value = "537")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Route summary", body = "Scheduled for tomorrow")

    }
}

@Preview
@Composable
internal fun OrdersWorkout9ScreenPreview() {
    OrdersWorkout9Screen()
}
