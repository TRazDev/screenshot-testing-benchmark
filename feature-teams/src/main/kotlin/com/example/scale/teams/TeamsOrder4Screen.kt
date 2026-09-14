package com.example.scale.teams

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun TeamsOrder4Screen() {
    AppScreen(
        title = "Order overview",
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Archived reservations", value = "367")
            StatCard(label = "Shared tickets", value = "360")
            StatCard(label = "Shared tasks", value = "50")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Invoice summary", body = "Updated a few minutes ago")

    }
}

@Preview
@Composable
internal fun TeamsOrder4ScreenPreview() {
    TeamsOrder4Screen()
}
