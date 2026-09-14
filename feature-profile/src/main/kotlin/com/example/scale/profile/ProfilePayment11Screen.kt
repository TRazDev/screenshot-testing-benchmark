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
public fun ProfilePayment11Screen() {
    AppScreen(
        title = "Team payments",
        selectedNav = 0,
        showFab = true,
    ) {

        SearchField(query = "")
        FilterRow(options = listOf("Archived", "Draft", "Nearby"), selected = 1)
            PersonRow(name = "Barbara Liskov", detail = "Expires at the end of the month")
            PersonRow(name = "Alan Turing", detail = "Expires at the end of the month")
            PersonRow(name = "Dennis Ritchie", detail = "Waiting on approval")
            PersonRow(name = "Radia Perlman", detail = "Shared with three people")
            PersonRow(name = "Grace Hopper", detail = "Shared with three people")

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun ProfilePayment11ScreenPreview() {
    ProfilePayment11Screen()
}
