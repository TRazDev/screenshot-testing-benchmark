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
public fun SocialHabit0Screen() {
    AppScreen(
        title = "Recent habits",
        tabs = listOf("Shared", "Weekly"),
        selectedTab = 1,
        selectedNav = 3,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Weekly", "Shared", "Featured"), selected = 1)
            PersonRow(name = "Grace Hopper", detail = "Delivered to the London office")
            PersonRow(name = "Ada Lovelace", detail = "Shared with three people")
            PersonRow(name = "Barbara Liskov", detail = "Updated a few minutes ago")
            PersonRow(name = "Ken Thompson", detail = "No changes since last week")
            PersonRow(name = "Barbara Liskov", detail = "Synced across your devices")
            PersonRow(name = "Radia Perlman", detail = "Waiting on approval")
            PersonRow(name = "Katherine Johnson", detail = "Updated a few minutes ago")

    }
}

@Preview
@Composable
internal fun SocialHabit0ScreenPreview() {
    SocialHabit0Screen()
}
