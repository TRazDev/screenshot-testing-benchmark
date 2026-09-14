package com.example.scale.billing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun BillingContact2Screen() {
    AppScreen(
        title = "Contact overview",
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Nearby invoices", value = "535")
            StatCard(label = "Nearby reports", value = "719")
            StatCard(label = "Nearby portfolios", value = "994")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Playlist summary", body = "No changes since last week")

    }
}

@Preview
@Composable
internal fun BillingContact2ScreenPreview() {
    BillingContact2Screen()
}
