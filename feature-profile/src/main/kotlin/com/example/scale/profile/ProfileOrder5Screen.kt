package com.example.scale.profile

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
public fun ProfileOrder5Screen() {
    AppScreen(
        title = "Pending orders",
        selectedNav = 1,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Archived", "Recent", "Archived"), selected = 0)
            PersonRow(name = "Dennis Ritchie", detail = "Synced across your devices")
            PersonRow(name = "Ada Lovelace", detail = "Expires at the end of the month")
            PersonRow(name = "Margaret Hamilton", detail = "Updated a few minutes ago")
            PersonRow(name = "Grace Hopper", detail = "Waiting on approval")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ProfileOrder5ScreenPreview() {
    ProfileOrder5Screen()
}
