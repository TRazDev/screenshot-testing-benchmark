package com.example.scale.library

import androidx.compose.runtime.Composable
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.resources.Density
import com.android.resources.NightMode
import com.android.resources.ScreenOrientation
import com.android.resources.ScreenRatio
import com.android.resources.ScreenSize
import com.android.ide.common.rendering.api.SessionParams.RenderingMode
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class ScreenshotTest(
    @TestParameter private val preview: Preview,
    @TestParameter private val device: Device,
    @TestParameter private val nightMode: Appearance,
    @TestParameter private val fontScale: FontScale,
) {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = device.config.copy(nightMode = nightMode.mode, fontScale = fontScale.scale),
        theme = "android:Theme.Material.Light.NoActionBar",
        renderingMode = preview.renderingMode,
    )

    @Test
    fun snapshot() {
        paparazzi.snapshot { preview.content() }
    }

    enum class Preview(
        val content: @Composable () -> Unit,
        val renderingMode: RenderingMode = RenderingMode.NORMAL,
    ) {
        LibraryRecipe0Screen({ LibraryRecipe0ScreenPreview() }),
        LibraryShipment1Screen({ LibraryShipment1ScreenPreview() }),
        LibraryTask2Screen({ LibraryTask2ScreenPreview() }),
        LibraryPlaylist3Screen({ LibraryPlaylist3ScreenPreview() }),
        LibraryBudget4Screen({ LibraryBudget4ScreenPreview() }),
        LibraryTask5Screen({ LibraryTask5ScreenPreview() }),
        LibraryPlaylist6Screen({ LibraryPlaylist6ScreenPreview() })
    }

    enum class Device(val config: DeviceConfig) {
        Phone(PHONE),
        Foldable(
            PHONE.copy(
                screenWidth = 1840, screenHeight = 2208, xdpi = 379, ydpi = 380,
                ratio = ScreenRatio.NOTLONG, size = ScreenSize.LARGE,
            ),
        ),
        Tablet(
            PHONE.copy(
                screenWidth = 1600, screenHeight = 2560, xdpi = 276, ydpi = 276,
                orientation = ScreenOrientation.LANDSCAPE, density = Density.XHIGH,
                ratio = ScreenRatio.NOTLONG, size = ScreenSize.LARGE,
            ),
        ),
        Landscape(PHONE.copy(orientation = ScreenOrientation.LANDSCAPE)),
    }

    enum class Appearance(val mode: NightMode) { Light(NightMode.NOTNIGHT), Dark(NightMode.NIGHT) }

    enum class FontScale(val scale: Float) { Font100(1f), Font150(1.5f), Font200(2f) }

    private companion object {
        val PHONE = DeviceConfig.PIXEL_5.copy(
            screenWidth = 1080, screenHeight = 2424, xdpi = 428, ydpi = 424,
            density = Density.create(420), ratio = ScreenRatio.LONG,
        )
    }
}
