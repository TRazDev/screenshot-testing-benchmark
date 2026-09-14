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
public fun FinanceBudget5Screen() {
    AppScreen(
        title = "Nearby budgets",
        selectedNav = 2,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Team", "Weekly", "Recent"), selected = 0)
            PersonRow(name = "Grace Hopper", detail = "Delivered to the London office")
            PersonRow(name = "Grace Hopper", detail = "Scheduled for tomorrow")
            PersonRow(name = "Radia Perlman", detail = "Synced across your devices")
            PersonRow(name = "Katherine Johnson", detail = "Updated a few minutes ago")

    }
}

@Preview
@Composable
internal fun FinanceBudget5ScreenPreview() {
    FinanceBudget5Screen()
}
