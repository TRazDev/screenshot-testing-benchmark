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
public fun CalendarInvoice4Screen() {
    AppScreen(
        title = "Featured invoices",
        selectedNav = 3,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Recent", "Draft", "Nearby"), selected = 0)
            PersonRow(name = "Margaret Hamilton", detail = "Synced across your devices")
            PersonRow(name = "Ada Lovelace", detail = "Scheduled for tomorrow")
            PersonRow(name = "Barbara Liskov", detail = "Scheduled for tomorrow")
            PersonRow(name = "Linus Torvalds", detail = "Scheduled for tomorrow")
            PersonRow(name = "Ada Lovelace", detail = "Scheduled for tomorrow")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun CalendarInvoice4ScreenPreview() {
    CalendarInvoice4Screen()
}
