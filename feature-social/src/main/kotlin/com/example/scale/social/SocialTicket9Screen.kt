package com.example.scale.social

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun SocialTicket9Screen() {
    AppScreen(
        title = "Ticket overview",
        tabs = listOf("Shared", "Archived"),
        selectedTab = 0,
        selectedNav = 2,
        showFab = false,
    ) {

        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {
            StatCard(label = "Pending reservations", value = "920")
            StatCard(label = "Recent orders", value = "237")
            StatCard(label = "Nearby playlists", value = "104")
        }
        StepProgress(fraction = 0.3f)
        InfoCard(title = "Article summary", body = "No changes since last week")

    }
}

@Preview
@Composable
internal fun SocialTicket9ScreenPreview() {
    SocialTicket9Screen()
}
