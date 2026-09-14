package com.example.scale.devices

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun DevicesSubscription3Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Nearby", "Shared"),
        selectedTab = 0,
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Notifications", checked = false)
        ToggleRow(label = "Dark theme", checked = false)
        ToggleRow(label = "Sync on cellular", checked = true)
        ToggleRow(label = "Haptics", checked = true)
        ToggleRow(label = "Auto-play", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Ken Thompson", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun DevicesSubscription3ScreenPreview() {
    DevicesSubscription3Screen()
}
