package com.example.scale.travel

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
public fun TravelPayment7Screen() {
    AppScreen(
        title = "Payment details",
        selectedNav = 3,
        showFab = true,
    ) {

        InfoCard(
            title = "Shared reservation",
            body = "Scheduled for tomorrow",
        )
        RatingStars(rating = 2, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Waiting on approval")
        TagRow(tags = listOf("Featured", "Weekly", "Archived"))
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
internal fun TravelPayment7ScreenPreview() {
    TravelPayment7Screen()
}
