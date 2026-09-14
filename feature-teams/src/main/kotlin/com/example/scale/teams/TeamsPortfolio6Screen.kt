package com.example.scale.teams

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun TeamsPortfolio6Screen() {
    AppScreen(
        title = "Pending portfolios",
        tabs = listOf("Archived", "Pending"),
        selectedTab = 0,
        selectedNav = 1,
        showFab = false,
    ) {

        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. Waiting on approval.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun TeamsPortfolio6ScreenPreview() {
    TeamsPortfolio6Screen()
}
