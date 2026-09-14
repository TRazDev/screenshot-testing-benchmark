package com.example.scale.library

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
public fun LibraryTask2Screen() {
    AppScreen(
        title = "Task overview",
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Recent habits", value = "163")
            StatCard(label = "Featured contacts", value = "86")
            StatCard(label = "Archived routes", value = "882")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Recipe summary", body = "Shared with three people")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun LibraryTask2ScreenPreview() {
    LibraryTask2Screen()
}
