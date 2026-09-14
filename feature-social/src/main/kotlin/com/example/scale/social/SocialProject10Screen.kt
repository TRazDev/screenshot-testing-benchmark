package com.example.scale.social

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun SocialProject10Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Notifications", checked = true)
        ToggleRow(label = "Sync on cellular", checked = true)
        ToggleRow(label = "Auto-play", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Grace Hopper", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun SocialProject10ScreenPreview() {
    SocialProject10Screen()
}
