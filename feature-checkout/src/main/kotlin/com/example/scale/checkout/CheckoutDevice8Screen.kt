package com.example.scale.checkout

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
public fun CheckoutDevice8Screen() {
    AppScreen(
        title = "Settings",
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Haptics", checked = false)
        ToggleRow(label = "Auto-play", checked = true)
        ToggleRow(label = "Dark theme", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Radia Perlman", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun CheckoutDevice8ScreenPreview() {
    CheckoutDevice8Screen()
}
