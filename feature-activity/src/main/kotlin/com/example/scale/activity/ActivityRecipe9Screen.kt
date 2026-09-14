package com.example.scale.activity

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
public fun ActivityRecipe9Screen() {
    AppScreen(
        title = "Archived recipes",
        tabs = listOf("Shared", "Team"),
        selectedTab = 1,
        selectedNav = 1,
        showFab = false,
    ) {

        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. Waiting on approval.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ActivityRecipe9ScreenPreview() {
    ActivityRecipe9Screen()
}
