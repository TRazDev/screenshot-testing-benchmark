package com.example.scale.gallery

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun GalleryArticle3Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Featured", "Team"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Notifications", checked = true)
        ToggleRow(label = "Sync on cellular", checked = false)
        ToggleRow(label = "Haptics", checked = false)
        ToggleRow(label = "Auto-play", checked = true)
        ToggleRow(label = "Analytics", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Radia Perlman", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun GalleryArticle3ScreenPreview() {
    GalleryArticle3Screen()
}
