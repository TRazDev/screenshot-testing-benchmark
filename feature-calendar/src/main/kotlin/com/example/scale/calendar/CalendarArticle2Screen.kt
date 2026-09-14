package com.example.scale.calendar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun CalendarArticle2Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Sync on cellular", checked = false)
        ToggleRow(label = "Haptics", checked = true)
        ToggleRow(label = "Analytics", checked = true)
        ToggleRow(label = "Dark theme", checked = true)
        ToggleRow(label = "Auto-play", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Radia Perlman", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun CalendarArticle2ScreenPreview() {
    CalendarArticle2Screen()
}
