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
public fun SearchBudget12Screen() {
    AppScreen(
        title = "Archived budgets",
        tabs = listOf("Pending", "Featured"),
        selectedTab = 1,
        selectedNav = 3,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Recent", "Featured", "Weekly"), selected = 0)
            PersonRow(name = "Radia Perlman", detail = "Expires at the end of the month")
            PersonRow(name = "Katherine Johnson", detail = "Expires at the end of the month")
            PersonRow(name = "Barbara Liskov", detail = "Shared with three people")
            PersonRow(name = "Dennis Ritchie", detail = "Waiting on approval")
            PersonRow(name = "Alan Turing", detail = "Shared with three people")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun SearchBudget12ScreenPreview() {
    SearchBudget12Screen()
}
