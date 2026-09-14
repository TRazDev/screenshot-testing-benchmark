package com.example.scale.calendar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun CalendarContact5Screen() {
    AppScreen(
        title = "Contact details",
        selectedNav = 2,
        showFab = true,
    ) {

        InfoCard(
            title = "Weekly workout",
            body = "Updated a few minutes ago",
        )
        RatingStars(rating = 2, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Delivered to the London office")
        TagRow(tags = listOf("Team", "Recent", "Team"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun CalendarContact5ScreenPreview() {
    CalendarContact5Screen()
}
