package com.example.scale.inbox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun InboxTicket5Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 1,
        showFab = true,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Haptics", checked = false)
        ToggleRow(label = "Auto-play", checked = false)
        ToggleRow(label = "Analytics", checked = false)
        ToggleRow(label = "Dark theme", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Margaret Hamilton", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun InboxTicket5ScreenPreview() {
    InboxTicket5Screen()
}
