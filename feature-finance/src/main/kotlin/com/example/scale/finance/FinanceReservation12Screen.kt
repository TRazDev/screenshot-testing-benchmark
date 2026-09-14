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
public fun FinanceReservation12Screen() {
    AppScreen(
        title = "Reservation details",
        tabs = listOf("Recent", "Team"),
        selectedTab = 1,
        selectedNav = 3,
        showFab = false,
    ) {

        InfoCard(
            title = "Draft reservation",
            body = "Scheduled for tomorrow",
        )
        RatingStars(rating = 5, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "No changes since last week")
        TagRow(tags = listOf("Pending", "Archived", "Team"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun FinanceReservation12ScreenPreview() {
    FinanceReservation12Screen()
}
