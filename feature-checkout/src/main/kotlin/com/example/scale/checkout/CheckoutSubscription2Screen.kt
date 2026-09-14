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
public fun CheckoutSubscription2Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 3,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Sync on cellular", checked = true)
        ToggleRow(label = "Haptics", checked = true)
        ToggleRow(label = "Analytics", checked = true)
        ToggleRow(label = "Dark theme", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Barbara Liskov", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun CheckoutSubscription2ScreenPreview() {
    CheckoutSubscription2Screen()
}
