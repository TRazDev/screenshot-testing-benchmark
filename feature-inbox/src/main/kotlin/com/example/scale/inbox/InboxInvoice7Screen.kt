package com.example.scale.inbox

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
public fun InboxInvoice7Screen() {
    AppScreen(
        title = "Recent invoices",
        selectedNav = 2,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Draft", "Team", "Team"), selected = 0)
            PersonRow(name = "Margaret Hamilton", detail = "Scheduled for tomorrow")
            PersonRow(name = "Margaret Hamilton", detail = "Delivered to the London office")
            PersonRow(name = "Dennis Ritchie", detail = "Delivered to the London office")
            PersonRow(name = "Ada Lovelace", detail = "Scheduled for tomorrow")
            PersonRow(name = "Alan Turing", detail = "Expires at the end of the month")
            PersonRow(name = "Ada Lovelace", detail = "Expires at the end of the month")
            PersonRow(name = "Ada Lovelace", detail = "Scheduled for tomorrow")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun InboxInvoice7ScreenPreview() {
    InboxInvoice7Screen()
}
