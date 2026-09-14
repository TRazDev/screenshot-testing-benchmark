package com.example.scale.checkout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun CheckoutTask9Screen() {
    AppScreen(
        title = "Nearby tasks",
        tabs = listOf("Team", "Recent"),
        selectedTab = 0,
        selectedNav = 3,
        showFab = false,
    ) {

        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. Shared with three people.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun CheckoutTask9ScreenPreview() {
    CheckoutTask9Screen()
}
