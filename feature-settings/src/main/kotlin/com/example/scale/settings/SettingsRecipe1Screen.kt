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
public fun SettingsRecipe1Screen() {
    AppScreen(
        title = "Recipe overview",
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Team projects", value = "454")
            StatCard(label = "Nearby projects", value = "270")
            StatCard(label = "Nearby payments", value = "388")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Playlist summary", body = "Waiting on approval")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun SettingsRecipe1ScreenPreview() {
    SettingsRecipe1Screen()
}
