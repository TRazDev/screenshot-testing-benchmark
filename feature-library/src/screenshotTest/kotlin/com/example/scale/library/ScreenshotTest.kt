package com.example.scale.library

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.tools.screenshot.PreviewTest

@Preview(name = "Phone_Light_Font100", device = "spec:width=411dp,height=923dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 1f)
@Preview(name = "Phone_Light_Font150", device = "spec:width=411dp,height=923dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 1.5f)
@Preview(name = "Phone_Light_Font200", device = "spec:width=411dp,height=923dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 2f)
@Preview(name = "Phone_Dark_Font100", device = "spec:width=411dp,height=923dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 1f)
@Preview(name = "Phone_Dark_Font150", device = "spec:width=411dp,height=923dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 1.5f)
@Preview(name = "Phone_Dark_Font200", device = "spec:width=411dp,height=923dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 2f)
@Preview(name = "Foldable_Light_Font100", device = "spec:width=701dp,height=841dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 1f)
@Preview(name = "Foldable_Light_Font150", device = "spec:width=701dp,height=841dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 1.5f)
@Preview(name = "Foldable_Light_Font200", device = "spec:width=701dp,height=841dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 2f)
@Preview(name = "Foldable_Dark_Font100", device = "spec:width=701dp,height=841dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 1f)
@Preview(name = "Foldable_Dark_Font150", device = "spec:width=701dp,height=841dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 1.5f)
@Preview(name = "Foldable_Dark_Font200", device = "spec:width=701dp,height=841dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 2f)
@Preview(name = "Tablet_Light_Font100", device = "spec:width=1280dp,height=800dp,dpi=320", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 1f)
@Preview(name = "Tablet_Light_Font150", device = "spec:width=1280dp,height=800dp,dpi=320", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 1.5f)
@Preview(name = "Tablet_Light_Font200", device = "spec:width=1280dp,height=800dp,dpi=320", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 2f)
@Preview(name = "Tablet_Dark_Font100", device = "spec:width=1280dp,height=800dp,dpi=320", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 1f)
@Preview(name = "Tablet_Dark_Font150", device = "spec:width=1280dp,height=800dp,dpi=320", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 1.5f)
@Preview(name = "Tablet_Dark_Font200", device = "spec:width=1280dp,height=800dp,dpi=320", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 2f)
@Preview(name = "Landscape_Light_Font100", device = "spec:width=923dp,height=411dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 1f)
@Preview(name = "Landscape_Light_Font150", device = "spec:width=923dp,height=411dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 1.5f)
@Preview(name = "Landscape_Light_Font200", device = "spec:width=923dp,height=411dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_NO, fontScale = 2f)
@Preview(name = "Landscape_Dark_Font100", device = "spec:width=923dp,height=411dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 1f)
@Preview(name = "Landscape_Dark_Font150", device = "spec:width=923dp,height=411dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 1.5f)
@Preview(name = "Landscape_Dark_Font200", device = "spec:width=923dp,height=411dp,dpi=420", uiMode = Configuration.UI_MODE_NIGHT_YES, fontScale = 2f)
annotation class ScreenshotMatrix

@PreviewTest
@ScreenshotMatrix
@Composable
fun LibraryRecipe0ScreenPreviewScreenshot() {
    LibraryRecipe0ScreenPreview()
}

@PreviewTest
@ScreenshotMatrix
@Composable
fun LibraryShipment1ScreenPreviewScreenshot() {
    LibraryShipment1ScreenPreview()
}

@PreviewTest
@ScreenshotMatrix
@Composable
fun LibraryTask2ScreenPreviewScreenshot() {
    LibraryTask2ScreenPreview()
}

@PreviewTest
@ScreenshotMatrix
@Composable
fun LibraryPlaylist3ScreenPreviewScreenshot() {
    LibraryPlaylist3ScreenPreview()
}

@PreviewTest
@ScreenshotMatrix
@Composable
fun LibraryBudget4ScreenPreviewScreenshot() {
    LibraryBudget4ScreenPreview()
}

@PreviewTest
@ScreenshotMatrix
@Composable
fun LibraryTask5ScreenPreviewScreenshot() {
    LibraryTask5ScreenPreview()
}

@PreviewTest
@ScreenshotMatrix
@Composable
fun LibraryPlaylist6ScreenPreviewScreenshot() {
    LibraryPlaylist6ScreenPreview()
}
