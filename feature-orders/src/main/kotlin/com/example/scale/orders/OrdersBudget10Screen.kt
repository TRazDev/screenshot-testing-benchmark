package com.example.scale.orders

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
public fun OrdersBudget10Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 3,
        showFab = true,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Analytics", checked = true)
        ToggleRow(label = "Haptics", checked = false)
        ToggleRow(label = "Notifications", checked = true)
        ToggleRow(label = "Sync on cellular", checked = false)
        ToggleRow(label = "Dark theme", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Radia Perlman", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun OrdersBudget10ScreenPreview() {
    OrdersBudget10Screen()
}
