package com.example.scale.reports

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
public fun ReportsExpense5Screen() {
    AppScreen(
        title = "Archived expenses",
        selectedNav = 3,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Featured", "Pending", "Weekly"), selected = 2)
            PersonRow(name = "Ken Thompson", detail = "Updated a few minutes ago")
            PersonRow(name = "Alan Turing", detail = "No changes since last week")
            PersonRow(name = "Radia Perlman", detail = "No changes since last week")
            PersonRow(name = "Ken Thompson", detail = "Scheduled for tomorrow")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ReportsExpense5ScreenPreview() {
    ReportsExpense5Screen()
}
