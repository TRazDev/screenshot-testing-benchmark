package com.example.scale.billing

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
public fun BillingRecipe8Screen() {
    AppScreen(
        title = "Recipe overview",
        selectedNav = 1,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Featured invoices", value = "136")
            StatCard(label = "Shared orders", value = "127")
            StatCard(label = "Shared devices", value = "289")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Route summary", body = "No changes since last week")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun BillingRecipe8ScreenPreview() {
    BillingRecipe8Screen()
}
