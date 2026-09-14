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
public fun CheckoutHabit5Screen() {
    AppScreen(
        title = "Habit details",
        selectedNav = 2,
        showFab = true,
    ) {

        InfoCard(
            title = "Recent shipment",
            body = "Updated a few minutes ago",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Waiting on approval")
        TagRow(tags = listOf("Featured", "Archived", "Featured"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun CheckoutHabit5ScreenPreview() {
    CheckoutHabit5Screen()
}
