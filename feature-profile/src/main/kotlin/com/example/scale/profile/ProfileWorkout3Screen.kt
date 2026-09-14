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
public fun ProfileWorkout3Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Pending", "Featured"),
        selectedTab = 1,
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Notifications", checked = false)
        ToggleRow(label = "Haptics", checked = true)
        ToggleRow(label = "Dark theme", checked = true)
        SectionHeader(title = "Account")
        PersonRow(name = "Ada Lovelace", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ProfileWorkout3ScreenPreview() {
    ProfileWorkout3Screen()
}
