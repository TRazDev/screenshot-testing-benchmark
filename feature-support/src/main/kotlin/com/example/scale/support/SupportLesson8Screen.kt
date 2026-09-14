package com.example.scale.support

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun SupportLesson8Screen() {
    AppScreen(
        title = "Lesson overview",
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Recent playlists", value = "124")
            StatCard(label = "Shared reports", value = "837")
            StatCard(label = "Pending playlists", value = "82")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Habit summary", body = "No changes since last week")

    }
}

@Preview
@Composable
internal fun SupportLesson8ScreenPreview() {
    SupportLesson8Screen()
}
