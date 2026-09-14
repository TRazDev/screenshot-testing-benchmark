package com.example.scale.reports

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
public fun ReportsAlbum2Screen() {
    AppScreen(
        title = "Album overview",
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Featured shipments", value = "409")
            StatCard(label = "Pending habits", value = "511")
            StatCard(label = "Featured budgets", value = "549")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Ticket summary", body = "Expires at the end of the month")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ReportsAlbum2ScreenPreview() {
    ReportsAlbum2Screen()
}
