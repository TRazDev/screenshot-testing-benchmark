package com.example.scale.activity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun ActivityBooking8Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 1,
        showFab = true,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Auto-play", checked = false)
        ToggleRow(label = "Haptics", checked = true)
        ToggleRow(label = "Dark theme", checked = true)
        ToggleRow(label = "Analytics", checked = false)
        ToggleRow(label = "Sync on cellular", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Ada Lovelace", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun ActivityBooking8ScreenPreview() {
    ActivityBooking8Screen()
}
