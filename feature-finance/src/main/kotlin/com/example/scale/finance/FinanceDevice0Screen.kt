package com.example.scale.finance

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
public fun FinanceDevice0Screen() {
    AppScreen(
        title = "Device details",
        tabs = listOf("Pending", "Pending"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = true,
    ) {

        InfoCard(
            title = "Draft reservation",
            body = "Waiting on approval",
        )
        RatingStars(rating = 5, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "No changes since last week")
        TagRow(tags = listOf("Archived", "Draft", "Weekly"))
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
internal fun FinanceDevice0ScreenPreview() {
    FinanceDevice0Screen()
}
