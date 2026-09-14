package com.example.scale.support

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun SupportTicket3Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Nearby", "Weekly"),
        selectedTab = 1,
        selectedNav = 1,
        showFab = true,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Notifications", checked = false)
        ToggleRow(label = "Haptics", checked = true)
        ToggleRow(label = "Dark theme", checked = true)
        ToggleRow(label = "Sync on cellular", checked = true)
        ToggleRow(label = "Auto-play", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Alan Turing", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun SupportTicket3ScreenPreview() {
    SupportTicket3Screen()
}
