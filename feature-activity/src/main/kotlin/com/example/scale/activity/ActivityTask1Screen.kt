package com.example.scale.activity

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
public fun ActivityTask1Screen() {
    AppScreen(
        title = "Task overview",
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Shared expenses", value = "594")
            StatCard(label = "Recent subscriptions", value = "553")
            StatCard(label = "Shared reports", value = "60")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Report summary", body = "No changes since last week")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ActivityTask1ScreenPreview() {
    ActivityTask1Screen()
}
