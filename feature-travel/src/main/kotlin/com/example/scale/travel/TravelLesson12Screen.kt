package com.example.scale.travel

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
public fun TravelLesson12Screen() {
    AppScreen(
        title = "Draft lessons",
        tabs = listOf("Weekly", "Draft"),
        selectedTab = 0,
        selectedNav = 2,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Draft", "Recent", "Archived"), selected = 1)
            PersonRow(name = "Dennis Ritchie", detail = "Expires at the end of the month")
            PersonRow(name = "Radia Perlman", detail = "Synced across your devices")
            PersonRow(name = "Katherine Johnson", detail = "Waiting on approval")
            PersonRow(name = "Margaret Hamilton", detail = "Delivered to the London office")
            PersonRow(name = "Grace Hopper", detail = "Expires at the end of the month")
            PersonRow(name = "Barbara Liskov", detail = "No changes since last week")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun TravelLesson12ScreenPreview() {
    TravelLesson12Screen()
}
