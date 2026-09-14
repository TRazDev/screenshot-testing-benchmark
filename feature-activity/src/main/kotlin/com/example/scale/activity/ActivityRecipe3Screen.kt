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
public fun ActivityRecipe3Screen() {
    AppScreen(
        title = "Pending recipes",
        tabs = listOf("Recent", "Featured"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = true,
    ) {

        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. Expires at the end of the month.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ActivityRecipe3ScreenPreview() {
    ActivityRecipe3Screen()
}
