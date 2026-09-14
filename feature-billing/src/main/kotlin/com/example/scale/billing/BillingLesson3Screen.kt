package com.example.scale.billing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun BillingLesson3Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Recent", "Draft"),
        selectedTab = 0,
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Dark theme", checked = true)
        ToggleRow(label = "Auto-play", checked = true)
        ToggleRow(label = "Analytics", checked = true)
        ToggleRow(label = "Haptics", checked = false)
        ToggleRow(label = "Notifications", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Margaret Hamilton", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun BillingLesson3ScreenPreview() {
    BillingLesson3Screen()
}
