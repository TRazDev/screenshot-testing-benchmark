package com.example.scale.account

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun AccountPortfolio3Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Recent", "Shared"),
        selectedTab = 0,
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Auto-play", checked = false)
        ToggleRow(label = "Dark theme", checked = false)
        ToggleRow(label = "Notifications", checked = true)
        ToggleRow(label = "Haptics", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Alan Turing", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun AccountPortfolio3ScreenPreview() {
    AccountPortfolio3Screen()
}
