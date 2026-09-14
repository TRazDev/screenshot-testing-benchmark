package com.example.scale.storage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun StorageProject8Screen() {
    AppScreen(
        title = "Project overview",
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Pending tickets", value = "776")
            StatCard(label = "Recent shipments", value = "340")
            StatCard(label = "Featured portfolios", value = "53")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Booking summary", body = "Expires at the end of the month")

    }
}

@Preview
@Composable
internal fun StorageProject8ScreenPreview() {
    StorageProject8Screen()
}
