package com.example.scale.storage

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
public fun StorageRoute9Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Weekly", "Archived"),
        selectedTab = 1,
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Auto-play", checked = true)
        ToggleRow(label = "Haptics", checked = false)
        ToggleRow(label = "Notifications", checked = false)
        ToggleRow(label = "Analytics", checked = true)
        ToggleRow(label = "Dark theme", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Grace Hopper", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun StorageRoute9ScreenPreview() {
    StorageRoute9Screen()
}
