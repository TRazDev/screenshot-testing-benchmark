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
public fun FinanceReservation8Screen() {
    AppScreen(
        title = "Reservation overview",
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Recent orders", value = "64")
            StatCard(label = "Nearby albums", value = "135")
            StatCard(label = "Recent habits", value = "338")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Recipe summary", body = "Scheduled for tomorrow")

    }
}

@Preview
@Composable
internal fun FinanceReservation8ScreenPreview() {
    FinanceReservation8Screen()
}
