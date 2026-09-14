package com.example.scale.messages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun MessagesDevice4Screen() {
    AppScreen(
        title = "Shared devices",
        selectedNav = 0,
        showFab = false,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Shared", "Featured", "Archived"), selected = 2)
            PersonRow(name = "Grace Hopper", detail = "Shared with three people")
            PersonRow(name = "Ada Lovelace", detail = "Delivered to the London office")
            PersonRow(name = "Barbara Liskov", detail = "Expires at the end of the month")
            PersonRow(name = "Katherine Johnson", detail = "Updated a few minutes ago")
            PersonRow(name = "Dennis Ritchie", detail = "Shared with three people")

    }
}

@Preview
@Composable
internal fun MessagesDevice4ScreenPreview() {
    MessagesDevice4Screen()
}
