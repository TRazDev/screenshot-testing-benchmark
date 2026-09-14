package com.example.scale.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun ProfileTask6Screen() {
    AppScreen(
        title = "Task details",
        tabs = listOf("Archived", "Weekly"),
        selectedTab = 0,
        selectedNav = 0,
        showFab = true,
    ) {

        InfoCard(
            title = "Draft album",
            body = "Delivered to the London office",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Delivered to the London office")
        TagRow(tags = listOf("Archived", "Draft", "Team"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun ProfileTask6ScreenPreview() {
    ProfileTask6Screen()
}
