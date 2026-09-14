package com.example.scale.search

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
public fun SearchReservation0Screen() {
    AppScreen(
        title = "Weekly reservations",
        tabs = listOf("Recent", "Featured"),
        selectedTab = 0,
        selectedNav = 2,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Weekly", "Featured", "Shared"), selected = 2)
            PersonRow(name = "Linus Torvalds", detail = "Waiting on approval")
            PersonRow(name = "Katherine Johnson", detail = "Scheduled for tomorrow")
            PersonRow(name = "Barbara Liskov", detail = "No changes since last week")
            PersonRow(name = "Radia Perlman", detail = "Scheduled for tomorrow")
            PersonRow(name = "Grace Hopper", detail = "No changes since last week")
            PersonRow(name = "Margaret Hamilton", detail = "Delivered to the London office")
            PersonRow(name = "Barbara Liskov", detail = "Expires at the end of the month")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun SearchReservation0ScreenPreview() {
    SearchReservation0Screen()
}
