package com.example.scale.reports

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun ReportsAlbum4Screen() {
    AppScreen(
        title = "Featured albums",
        selectedNav = 0,
        showFab = false,
    ) {

        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. Synced across your devices.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun ReportsAlbum4ScreenPreview() {
    ReportsAlbum4Screen()
}
