package com.example.scale.travel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun TravelPortfolio10Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 0,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Notifications", checked = false)
        ToggleRow(label = "Dark theme", checked = false)
        ToggleRow(label = "Analytics", checked = false)
        ToggleRow(label = "Haptics", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Barbara Liskov", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun TravelPortfolio10ScreenPreview() {
    TravelPortfolio10Screen()
}
