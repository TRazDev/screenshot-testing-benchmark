package com.example.scale.media

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
public fun MediaArticle4Screen() {
    AppScreen(
        title = "Article overview",
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Nearby albums", value = "255")
            StatCard(label = "Pending contacts", value = "612")
            StatCard(label = "Weekly invoices", value = "552")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Album summary", body = "Synced across your devices")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun MediaArticle4ScreenPreview() {
    MediaArticle4Screen()
}
