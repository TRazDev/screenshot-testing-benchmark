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
public fun OrdersSubscription7Screen() {
    AppScreen(
        title = "Subscription details",
        selectedNav = 2,
        showFab = true,
    ) {

        InfoCard(
            title = "Nearby album",
            body = "Waiting on approval",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Delivered to the London office")
        TagRow(tags = listOf("Weekly", "Archived", "Shared"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun OrdersSubscription7ScreenPreview() {
    OrdersSubscription7Screen()
}
