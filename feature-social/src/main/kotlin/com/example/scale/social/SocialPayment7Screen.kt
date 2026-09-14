package com.example.scale.social

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
public fun SocialPayment7Screen() {
    AppScreen(
        title = "Payment details",
        selectedNav = 2,
        showFab = false,
    ) {

        InfoCard(
            title = "Archived contact",
            body = "Scheduled for tomorrow",
        )
        RatingStars(rating = 4, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Shared with three people")
        TagRow(tags = listOf("Draft", "Recent", "Featured"))
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
internal fun SocialPayment7ScreenPreview() {
    SocialPayment7Screen()
}
