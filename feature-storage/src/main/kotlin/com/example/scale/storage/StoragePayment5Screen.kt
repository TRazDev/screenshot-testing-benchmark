package com.example.scale.storage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun StoragePayment5Screen() {
    AppScreen(
        title = "Weekly payments",
        selectedNav = 1,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Team", "Shared", "Nearby"), selected = 0)
            PersonRow(name = "Grace Hopper", detail = "No changes since last week")
            PersonRow(name = "Ken Thompson", detail = "Updated a few minutes ago")
            PersonRow(name = "Dennis Ritchie", detail = "Shared with three people")
            PersonRow(name = "Alan Turing", detail = "Delivered to the London office")

    }
}

@Preview
@Composable
internal fun StoragePayment5ScreenPreview() {
    StoragePayment5Screen()
}
