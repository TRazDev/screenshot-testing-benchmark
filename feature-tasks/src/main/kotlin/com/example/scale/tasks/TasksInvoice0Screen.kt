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
public fun TasksInvoice0Screen() {
    AppScreen(
        title = "Shared invoices",
        tabs = listOf("Pending", "Team"),
        selectedTab = 1,
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
internal fun TasksInvoice0ScreenPreview() {
    TasksInvoice0Screen()
}
