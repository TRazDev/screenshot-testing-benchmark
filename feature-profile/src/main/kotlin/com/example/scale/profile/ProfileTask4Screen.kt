package com.example.scale.profile

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
public fun ProfileTask4Screen() {
    AppScreen(
        title = "Featured tasks",
        selectedNav = 1,
        showFab = true,
    ) {

        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. No changes since last week.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ProfileTask4ScreenPreview() {
    ProfileTask4Screen()
}
