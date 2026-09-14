package com.example.scale.support

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
public fun SupportBudget0Screen() {
    AppScreen(
        title = "Budget details",
        tabs = listOf("Archived", "Pending"),
        selectedTab = 0,
        selectedNav = 2,
        showFab = true,
    ) {

        InfoCard(
            title = "Featured workout",
            body = "Waiting on approval",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Scheduled for tomorrow")
        TagRow(tags = listOf("Featured", "Archived", "Featured"))
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
internal fun SupportBudget0ScreenPreview() {
    SupportBudget0Screen()
}
