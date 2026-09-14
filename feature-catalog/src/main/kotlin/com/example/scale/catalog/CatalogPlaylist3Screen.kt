package com.example.scale.catalog

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
public fun CatalogPlaylist3Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Team", "Featured"),
        selectedTab = 1,
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Sync on cellular", checked = true)
        ToggleRow(label = "Notifications", checked = true)
        ToggleRow(label = "Auto-play", checked = false)
        ToggleRow(label = "Analytics", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Ada Lovelace", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun CatalogPlaylist3ScreenPreview() {
    CatalogPlaylist3Screen()
}
