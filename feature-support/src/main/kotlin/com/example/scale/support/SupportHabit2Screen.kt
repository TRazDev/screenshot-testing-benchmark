package com.example.scale.support

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
public fun SupportHabit2Screen() {
    AppScreen(
        title = "Habit overview",
        selectedNav = 0,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Archived contacts", value = "251")
            StatCard(label = "Nearby playlists", value = "343")
            StatCard(label = "Featured recipes", value = "125")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Subscription summary", body = "Shared with three people")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun SupportHabit2ScreenPreview() {
    SupportHabit2Screen()
}
