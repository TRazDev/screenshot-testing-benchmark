package com.example.scale.orders

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uk.co.fractalmotion.mugshot.annotations.Mugshot
import uk.co.fractalmotion.mugshot.annotations.MugshotMatrix
import com.example.scale.designsystem.*

@Composable
public fun OrdersBooking1Screen() {
    AppScreen(
        title = "Booking details",
        selectedNav = 3,
        showFab = true,
    ) {

        InfoCard(
            title = "Shared playlist",
            body = "Delivered to the London office",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "No changes since last week")
        TagRow(tags = listOf("Archived", "Draft", "Archived"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun OrdersBooking1ScreenPreview() {
    OrdersBooking1Screen()
}
