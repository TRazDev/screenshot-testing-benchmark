package com.example.scale.finance

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun FinanceInvoice11Screen() {
    AppScreen(
        title = "Shared invoices",
        selectedNav = 3,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Archived", "Draft", "Featured"), selected = 2)
            PersonRow(name = "Dennis Ritchie", detail = "Shared with three people")
            PersonRow(name = "Katherine Johnson", detail = "Updated a few minutes ago")
            PersonRow(name = "Ken Thompson", detail = "Scheduled for tomorrow")
            PersonRow(name = "Radia Perlman", detail = "Delivered to the London office")
            PersonRow(name = "Grace Hopper", detail = "Expires at the end of the month")

    }
}

@Preview
@Composable
internal fun FinanceInvoice11ScreenPreview() {
    FinanceInvoice11Screen()
}
