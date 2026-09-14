package com.example.scale.checkout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scale.designsystem.*

@Composable
public fun CheckoutArticle6Screen() {
    AppScreen(
        title = "New article",
        tabs = listOf("Shared", "Weekly"),
        selectedTab = 1,
        selectedNav = 1,
        showFab = false,
    ) {

        SectionHeader(title = "Details")
        LabelledField(label = "Address", value = "")
        LabelledField(label = "Phone", value = "")
        LabelledField(label = "Note", value = "")
        LabelledField(label = "Email", value = "")
        CheckRow(label = "Send me a copy", checked = false)
        ChoiceRow(label = "Standard delivery", selected = true)
        ChoiceRow(label = "Express delivery", selected = false)
        AmountSlider(value = 0.25f)
        PrimaryAction(label = "Submit", modifier = Modifier.padding(16.dp))

    }
}

@Preview
@Composable
internal fun CheckoutArticle6ScreenPreview() {
    CheckoutArticle6Screen()
}
