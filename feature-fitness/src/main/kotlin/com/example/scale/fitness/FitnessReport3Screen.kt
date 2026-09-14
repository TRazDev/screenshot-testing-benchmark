package com.example.scale.fitness

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun FitnessReport3Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Archived", "Recent"),
        selectedTab = 0,
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Haptics", checked = false)
        ToggleRow(label = "Analytics", checked = false)
        ToggleRow(label = "Sync on cellular", checked = false)
        ToggleRow(label = "Notifications", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Ken Thompson", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun FitnessReport3ScreenPreview() {
    FitnessReport3Screen()
}
