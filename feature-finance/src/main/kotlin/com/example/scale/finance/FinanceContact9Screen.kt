package com.example.scale.finance

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun FinanceContact9Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Weekly", "Weekly"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = true,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Analytics", checked = false)
        ToggleRow(label = "Auto-play", checked = false)
        ToggleRow(label = "Notifications", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Alan Turing", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun FinanceContact9ScreenPreview() {
    FinanceContact9Screen()
}
