package com.example.scale.catalog

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
public fun CatalogTask2Screen() {
    AppScreen(
        title = "Task overview",
        selectedNav = 2,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Archived albums", value = "510")
            StatCard(label = "Shared articles", value = "274")
            StatCard(label = "Recent playlists", value = "124")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Lesson summary", body = "Synced across your devices")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun CatalogTask2ScreenPreview() {
    CatalogTask2Screen()
}
