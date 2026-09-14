package com.example.scale.checkout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun CheckoutPlaylist13Screen() {
    AppScreen(
        title = "Playlist overview",
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Pending recipes", value = "184")
            StatCard(label = "Shared workouts", value = "635")
            StatCard(label = "Nearby recipes", value = "478")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Article summary", body = "Waiting on approval")

    }
}

@Preview
@Composable
internal fun CheckoutPlaylist13ScreenPreview() {
    CheckoutPlaylist13Screen()
}
