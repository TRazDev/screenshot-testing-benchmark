package com.example.scale.inbox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun InboxArticle10Screen() {
    AppScreen(
        title = "Article overview",
        selectedNav = 3,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Weekly invoices", value = "366")
            StatCard(label = "Draft albums", value = "766")
            StatCard(label = "Recent recipes", value = "199")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Expense summary", body = "Delivered to the London office")

    }
}

@Preview
@Composable
internal fun InboxArticle10ScreenPreview() {
    InboxArticle10Screen()
}
