package com.example.scale.catalog

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
public fun CatalogContact6Screen() {
    AppScreen(
        title = "Contact details",
        tabs = listOf("Shared", "Pending"),
        selectedTab = 0,
        selectedNav = 1,
        showFab = false,
    ) {

        InfoCard(
            title = "Recent workout",
            body = "Updated a few minutes ago",
        )
        RatingStars(rating = 4, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "No changes since last week")
        TagRow(tags = listOf("Team", "Draft", "Archived"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }

    }
}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun CatalogContact6ScreenPreview() {
    CatalogContact6Screen()
}
