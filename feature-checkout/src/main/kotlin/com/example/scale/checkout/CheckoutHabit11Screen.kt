package com.example.scale.checkout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun CheckoutHabit11Screen() {
    AppScreen(
        title = "Habit details",
        selectedNav = 0,
        showFab = false,
    ) {

        InfoCard(
            title = "Draft payment",
            body = "Expires at the end of the month",
        )
        RatingStars(rating = 2, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "No changes since last week")
        TagRow(tags = listOf("Weekly", "Featured", "Nearby"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun CheckoutHabit11ScreenPreview() {
    CheckoutHabit11Screen()
}
