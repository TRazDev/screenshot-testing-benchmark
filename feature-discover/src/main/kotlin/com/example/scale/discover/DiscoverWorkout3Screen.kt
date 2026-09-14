package com.example.scale.discover

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun DiscoverWorkout3Screen() {
    AppScreen(
        title = "Draft workouts",
        tabs = listOf("Weekly", "Featured"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = true,
    ) {

        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. Updated a few minutes ago.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun DiscoverWorkout3ScreenPreview() {
    DiscoverWorkout3Screen()
}
