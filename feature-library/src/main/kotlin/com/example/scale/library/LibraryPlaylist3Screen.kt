package com.example.scale.library

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun LibraryPlaylist3Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Recent", "Recent"),
        selectedTab = 0,
        selectedNav = 0,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Notifications", checked = true)
        ToggleRow(label = "Sync on cellular", checked = true)
        ToggleRow(label = "Haptics", checked = true)
        ToggleRow(label = "Dark theme", checked = false)
        ToggleRow(label = "Analytics", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Grace Hopper", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun LibraryPlaylist3ScreenPreview() {
    LibraryPlaylist3Screen()
}
