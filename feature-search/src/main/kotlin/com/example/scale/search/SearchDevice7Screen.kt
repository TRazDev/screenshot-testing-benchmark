package com.example.scale.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun SearchDevice7Screen() {
    AppScreen(
        title = "Device details",
        selectedNav = 3,
        showFab = true,
    ) {

        InfoCard(
            title = "Featured playlist",
            body = "Scheduled for tomorrow",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Shared with three people")
        TagRow(tags = listOf("Shared", "Team", "Featured"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Preview
@Composable
internal fun SearchDevice7ScreenPreview() {
    SearchDevice7Screen()
}
