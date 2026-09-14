package com.example.scale.onboarding

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
public fun OnboardingSubscription3Screen() {
    AppScreen(
        title = "Subscription details",
        tabs = listOf("Shared", "Recent"),
        selectedTab = 1,
        selectedNav = 0,
        showFab = false,
    ) {

        InfoCard(
            title = "Team recipe",
            body = "Delivered to the London office",
        )
        RatingStars(rating = 3, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "Scheduled for tomorrow")
        TagRow(tags = listOf("Nearby", "Nearby", "Recent"))
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
internal fun OnboardingSubscription3ScreenPreview() {
    OnboardingSubscription3Screen()
}
