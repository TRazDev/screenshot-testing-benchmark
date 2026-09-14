package com.example.scale.settings

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
public fun SettingsShipment7Screen() {
    AppScreen(
        title = "Shipment overview",
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Recent reports", value = "491")
            StatCard(label = "Featured orders", value = "651")
            StatCard(label = "Featured routes", value = "471")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Subscription summary", body = "Waiting on approval")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun SettingsShipment7ScreenPreview() {
    SettingsShipment7Screen()
}
