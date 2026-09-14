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
public fun MediaProject5Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Auto-play", checked = false)
        ToggleRow(label = "Analytics", checked = true)
        ToggleRow(label = "Sync on cellular", checked = true)
        ToggleRow(label = "Dark theme", checked = false)
        ToggleRow(label = "Notifications", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Katherine Johnson", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun MediaProject5ScreenPreview() {
    MediaProject5Screen()
}
