package com.example.scale.teams

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun TeamsArticle11Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 2,
        showFab = true,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Haptics", checked = false)
        ToggleRow(label = "Analytics", checked = false)
        ToggleRow(label = "Notifications", checked = true)
        ToggleRow(label = "Auto-play", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Alan Turing", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun TeamsArticle11ScreenPreview() {
    TeamsArticle11Screen()
}
