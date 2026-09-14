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
public fun CheckoutRoute7Screen() {
    AppScreen(
        title = "Route overview",
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Team articles", value = "523")
            StatCard(label = "Shared reservations", value = "721")
            StatCard(label = "Pending contacts", value = "645")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Invoice summary", body = "Synced across your devices")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun CheckoutRoute7ScreenPreview() {
    CheckoutRoute7Screen()
}
