package com.example.scale.storage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun StorageReservation3Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Recent", "Featured"),
        selectedTab = 1,
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Dark theme", checked = false)
        ToggleRow(label = "Auto-play", checked = false)
        ToggleRow(label = "Notifications", checked = true)
        ToggleRow(label = "Analytics", checked = false)
        ToggleRow(label = "Haptics", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Linus Torvalds", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun StorageReservation3ScreenPreview() {
    StorageReservation3Screen()
}
