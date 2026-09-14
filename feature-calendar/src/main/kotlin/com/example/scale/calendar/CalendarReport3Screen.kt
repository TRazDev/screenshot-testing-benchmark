package com.example.scale.calendar

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
public fun CalendarReport3Screen() {
    AppScreen(
        title = "Draft reports",
        tabs = listOf("Archived", "Nearby"),
        selectedTab = 0,
        selectedNav = 1,
        showFab = true,
    ) {

        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. Shared with three people.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun CalendarReport3ScreenPreview() {
    CalendarReport3Screen()
}
