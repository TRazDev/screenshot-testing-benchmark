package com.example.scale.storage

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
public fun StorageContact2Screen() {
    AppScreen(
        title = "Contact overview",
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Draft expenses", value = "189")
            StatCard(label = "Shared workouts", value = "528")
            StatCard(label = "Pending workouts", value = "497")
        }
        StepProgress(fraction = 0.6f)
        InfoCard(title = "Invoice summary", body = "Shared with three people")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun StorageContact2ScreenPreview() {
    StorageContact2Screen()
}
