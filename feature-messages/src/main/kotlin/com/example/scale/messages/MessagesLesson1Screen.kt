package com.example.scale.messages

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
public fun MessagesLesson1Screen() {
    AppScreen(
        title = "Lesson overview",
        selectedNav = 2,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Recent playlists", value = "924")
            StatCard(label = "Nearby projects", value = "289")
            StatCard(label = "Featured habits", value = "412")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Budget summary", body = "No changes since last week")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun MessagesLesson1ScreenPreview() {
    MessagesLesson1Screen()
}
