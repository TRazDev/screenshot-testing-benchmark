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
public fun CalendarBudget8Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Dark theme", checked = false)
        ToggleRow(label = "Analytics", checked = false)
        ToggleRow(label = "Haptics", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Radia Perlman", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun CalendarBudget8ScreenPreview() {
    CalendarBudget8Screen()
}
