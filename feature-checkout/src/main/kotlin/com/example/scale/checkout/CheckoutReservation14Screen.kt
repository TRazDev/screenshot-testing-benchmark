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
public fun CheckoutReservation14Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 3,
        showFab = true,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Analytics", checked = true)
        ToggleRow(label = "Auto-play", checked = false)
        ToggleRow(label = "Sync on cellular", checked = true)
        ToggleRow(label = "Haptics", checked = false)
        ToggleRow(label = "Notifications", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Margaret Hamilton", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun CheckoutReservation14ScreenPreview() {
    CheckoutReservation14Screen()
}
