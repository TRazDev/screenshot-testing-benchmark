package com.example.scale.designsystem

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uk.co.fractalmotion.mugshot.annotations.Mugshot
import uk.co.fractalmotion.mugshot.annotations.MugshotMatrix
import uk.co.fractalmotion.mugshot.annotations.MugshotShrink

/** Component catalogue: the same shape a real design system ships to document itself. */
@Mugshot
@MugshotMatrix
@MugshotShrink
@Preview
@Composable
internal fun ButtonCatalogPreview() {
    AppTheme {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            PrimaryAction(label = "Primary")
            SecondaryAction(label = "Secondary")
            TertiaryAction(label = "Tertiary")
            LinkAction(label = "Link")
        }
    }
}

@Mugshot
@MugshotMatrix
@MugshotShrink
@Preview
@Composable
internal fun CardCatalogPreview() {
    AppTheme {
        Column(Modifier.padding(8.dp)) {
            InfoCard(title = "Info card", body = "Supporting text on a filled card.")
            OutlinedInfo(text = "Outlined card with a single line of text.")
            Row {
                StatCard(label = "Open", value = "24")
                StatCard(label = "Closed", value = "108")
            }
        }
    }
}

@Mugshot
@MugshotMatrix
@MugshotShrink
@Preview
@Composable
internal fun SelectionCatalogPreview() {
    AppTheme {
        Column(Modifier.padding(8.dp)) {
            ToggleRow(label = "Switch", checked = true)
            CheckRow(label = "Checkbox", checked = true)
            ChoiceRow(label = "Radio", selected = true)
            AmountSlider(value = 0.6f)
        }
    }
}

@Mugshot
@MugshotMatrix
@MugshotShrink
@Preview
@Composable
internal fun ChipCatalogPreview() {
    AppTheme {
        Column(Modifier.padding(8.dp)) {
            TagRow(tags = listOf("Assist", "Suggestion", "Input"))
            FilterRow(options = listOf("All", "Recent", "Shared"), selected = 1)
        }
    }
}

@Mugshot
@MugshotMatrix
@MugshotShrink
@Preview
@Composable
internal fun FieldCatalogPreview() {
    AppTheme {
        Column(Modifier.padding(8.dp)) {
            SearchField(query = "")
            LabelledField(label = "Full name", value = "Ada Lovelace")
        }
    }
}

@Mugshot
@MugshotMatrix
@MugshotShrink
@Preview
@Composable
internal fun ContentCatalogPreview() {
    AppTheme {
        Column(Modifier.padding(8.dp)) {
            SectionHeader(title = "Section header")
            PersonRow(name = "Grace Hopper", detail = "Signed in")
            RatingStars(rating = 4, modifier = Modifier.padding(16.dp))
            CountBadge(count = 12, modifier = Modifier.padding(16.dp))
            StepProgress(fraction = 0.45f)
            BusyIndicator()
        }
    }
}
