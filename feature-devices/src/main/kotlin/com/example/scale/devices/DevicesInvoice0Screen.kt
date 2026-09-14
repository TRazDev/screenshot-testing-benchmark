package com.example.scale.devices

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
public fun DevicesInvoice0Screen() {
    AppScreen(
        title = "Invoice details",
        tabs = listOf("Weekly", "Nearby"),
        selectedTab = 1,
        selectedNav = 3,
        showFab = false,
    ) {

        InfoCard(
            title = "Featured task",
            body = "Shared with three people",
        )
        RatingStars(rating = 2, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Updated a few minutes ago")
        TagRow(tags = listOf("Team", "Archived", "Recent"))
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
internal fun DevicesInvoice0ScreenPreview() {
    DevicesInvoice0Screen()
}
