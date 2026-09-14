package com.example.scale.library

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
public fun LibraryBudget4Screen() {
    AppScreen(
        title = "Nearby budgets",
        selectedNav = 1,
        showFab = false,
    ) {

        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. Delivered to the London office.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun LibraryBudget4ScreenPreview() {
    LibraryBudget4Screen()
}
