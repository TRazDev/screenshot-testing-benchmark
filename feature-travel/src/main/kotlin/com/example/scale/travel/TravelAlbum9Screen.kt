package com.example.scale.travel

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
public fun TravelAlbum9Screen() {
    AppScreen(
        title = "Album overview",
        tabs = listOf("Weekly", "Shared"),
        selectedTab = 0,
        selectedNav = 0,
        showFab = true,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Recent reports", value = "389")
            StatCard(label = "Archived recipes", value = "215")
            StatCard(label = "Recent invoices", value = "346")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Invoice summary", body = "Expires at the end of the month")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun TravelAlbum9ScreenPreview() {
    TravelAlbum9Screen()
}
