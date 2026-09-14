package com.example.scale.checkout

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
public fun CheckoutPortfolio1Screen() {
    AppScreen(
        title = "Portfolio overview",
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Weekly shipments", value = "710")
            StatCard(label = "Recent portfolios", value = "106")
            StatCard(label = "Shared portfolios", value = "403")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Reservation summary", body = "Expires at the end of the month")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun CheckoutPortfolio1ScreenPreview() {
    CheckoutPortfolio1Screen()
}
