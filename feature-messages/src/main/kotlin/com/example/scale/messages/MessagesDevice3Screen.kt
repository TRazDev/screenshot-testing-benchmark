package com.example.scale.messages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun MessagesDevice3Screen() {
    AppScreen(
        title = "Featured devices",
        tabs = listOf("Weekly", "Draft"),
        selectedTab = 1,
        selectedNav = 3,
        showFab = false,
    ) {

        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. Delivered to the London office.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun MessagesDevice3ScreenPreview() {
    MessagesDevice3Screen()
}
