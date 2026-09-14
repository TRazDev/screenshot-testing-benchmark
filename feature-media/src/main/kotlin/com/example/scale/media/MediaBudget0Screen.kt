package com.example.scale.media

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun MediaBudget0Screen() {
    AppScreen(
        title = "Weekly budgets",
        tabs = listOf("Weekly", "Recent"),
        selectedTab = 0,
        selectedNav = 1,
        showFab = true,
    ) {

        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. Expires at the end of the month.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun MediaBudget0ScreenPreview() {
    MediaBudget0Screen()
}
