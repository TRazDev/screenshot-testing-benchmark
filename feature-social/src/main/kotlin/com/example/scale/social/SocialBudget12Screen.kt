package com.example.scale.social

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
public fun SocialBudget12Screen() {
    AppScreen(
        title = "Team budgets",
        tabs = listOf("Nearby", "Team"),
        selectedTab = 1,
        selectedNav = 1,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Featured", "Weekly", "Nearby"), selected = 1)
            PersonRow(name = "Ken Thompson", detail = "Expires at the end of the month")
            PersonRow(name = "Linus Torvalds", detail = "Synced across your devices")
            PersonRow(name = "Barbara Liskov", detail = "Expires at the end of the month")
            PersonRow(name = "Katherine Johnson", detail = "Shared with three people")
            PersonRow(name = "Dennis Ritchie", detail = "No changes since last week")
            PersonRow(name = "Ken Thompson", detail = "Delivered to the London office")
            PersonRow(name = "Radia Perlman", detail = "Scheduled for tomorrow")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun SocialBudget12ScreenPreview() {
    SocialBudget12Screen()
}
