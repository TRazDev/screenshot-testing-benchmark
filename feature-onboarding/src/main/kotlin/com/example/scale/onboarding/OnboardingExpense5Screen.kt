package com.example.scale.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun OnboardingExpense5Screen() {
    AppScreen(
        title = "Expense overview",
        selectedNav = 3,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Draft payments", value = "89")
            StatCard(label = "Weekly tasks", value = "336")
            StatCard(label = "Archived tasks", value = "207")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Invoice summary", body = "Delivered to the London office")

    }
}

@Preview
@Composable
internal fun OnboardingExpense5ScreenPreview() {
    OnboardingExpense5Screen()
}
