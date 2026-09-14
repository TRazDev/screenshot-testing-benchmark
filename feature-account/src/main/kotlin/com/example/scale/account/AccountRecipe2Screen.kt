package com.example.scale.account

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun AccountRecipe2Screen() {
    AppScreen(
        title = "Recipe overview",
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Recent subscriptions", value = "899")
            StatCard(label = "Team expenses", value = "311")
            StatCard(label = "Weekly tasks", value = "592")
        }
        StepProgress(fraction = 0.85f)
        InfoCard(title = "Subscription summary", body = "Updated a few minutes ago")

    }
}

@Preview
@Composable
internal fun AccountRecipe2ScreenPreview() {
    AccountRecipe2Screen()
}
