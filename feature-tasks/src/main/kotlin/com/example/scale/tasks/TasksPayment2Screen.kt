package com.example.scale.tasks

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun TasksPayment2Screen() {
    AppScreen(
        title = "Payment details",
        selectedNav = 2,
        showFab = false,
    ) {

        InfoCard(
            title = "Featured article",
            body = "Delivered to the London office",
        )
        RatingStars(rating = 4, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Synced across your devices")
        TagRow(tags = listOf("Team", "Team", "Weekly"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun TasksPayment2ScreenPreview() {
    TasksPayment2Screen()
}
