package com.example.scale.billing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun BillingRecipe9Screen() {
    AppScreen(
        title = "Settings",
        tabs = listOf("Weekly", "Featured"),
        selectedTab = 1,
        selectedNav = 3,
        showFab = true,
    ) {

        SectionHeader(title = "Preferences")
        ToggleRow(label = "Analytics", checked = false)
        ToggleRow(label = "Sync on cellular", checked = false)
        ToggleRow(label = "Notifications", checked = false)
        SectionHeader(title = "Account")
        PersonRow(name = "Dennis Ritchie", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))

    }
}

@Preview
@Composable
internal fun BillingRecipe9ScreenPreview() {
    BillingRecipe9Screen()
}
