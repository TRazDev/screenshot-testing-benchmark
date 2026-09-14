package com.example.scale.tasks

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
public fun TasksExpense5Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Sync on cellular", checked = false)
        ToggleRow(label = "Haptics", checked = true)
        ToggleRow(label = "Analytics", checked = false)
        ToggleRow(label = "Auto-play", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Linus Torvalds", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun TasksExpense5ScreenPreview() {
    TasksExpense5Screen()
}
