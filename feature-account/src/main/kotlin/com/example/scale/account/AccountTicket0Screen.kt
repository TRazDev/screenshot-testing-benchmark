package com.example.scale.account

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
public fun AccountTicket0Screen() {
    AppScreen(
        title = "Ticket details",
        tabs = listOf("Nearby", "Weekly"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = true,
    ) {

        InfoCard(
            title = "Pending expense",
            body = "Updated a few minutes ago",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Shared with three people")
        TagRow(tags = listOf("Weekly", "Archived", "Archived"))
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
internal fun AccountTicket0ScreenPreview() {
    AccountTicket0Screen()
}
