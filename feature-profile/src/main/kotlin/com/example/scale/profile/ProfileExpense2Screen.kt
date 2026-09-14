package com.example.scale.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun ProfileExpense2Screen() {
    AppScreen(
        title = "Expense overview",
        selectedNav = 0,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Draft payments", value = "814")
            StatCard(label = "Team projects", value = "940")
            StatCard(label = "Featured reservations", value = "641")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Contact summary", body = "Expires at the end of the month")

    }
}

@Preview
@Composable
internal fun ProfileExpense2ScreenPreview() {
    ProfileExpense2Screen()
}
