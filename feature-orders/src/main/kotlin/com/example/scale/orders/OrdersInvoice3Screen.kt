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
public fun OrdersInvoice3Screen() {
    AppScreen(
        title = "Invoice overview",
        tabs = listOf("Draft", "Recent"),
        selectedTab = 1,
        selectedNav = 1,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Recent payments", value = "20")
            StatCard(label = "Nearby shipments", value = "883")
            StatCard(label = "Featured orders", value = "297")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Invoice summary", body = "Shared with three people")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun OrdersInvoice3ScreenPreview() {
    OrdersInvoice3Screen()
}
