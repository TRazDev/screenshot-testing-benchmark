package com.example.scale.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun SearchWorkout9Screen() {
    AppScreen(
        title = "Workout overview",
        tabs = listOf("Draft", "Nearby"),
        selectedTab = 1,
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Archived albums", value = "797")
            StatCard(label = "Pending recipes", value = "806")
            StatCard(label = "Draft invoices", value = "819")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Album summary", body = "Expires at the end of the month")

    }
}

@Preview
@Composable
internal fun SearchWorkout9ScreenPreview() {
    SearchWorkout9Screen()
}
