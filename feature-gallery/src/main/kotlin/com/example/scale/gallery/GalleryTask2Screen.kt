package com.example.scale.gallery

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun GalleryTask2Screen() {
    AppScreen(
        title = "Task overview",
        selectedNav = 2,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Pending projects", value = "4")
            StatCard(label = "Featured portfolios", value = "184")
            StatCard(label = "Team albums", value = "459")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Subscription summary", body = "Scheduled for tomorrow")

    }
}

@Preview
@Composable
internal fun GalleryTask2ScreenPreview() {
    GalleryTask2Screen()
}
