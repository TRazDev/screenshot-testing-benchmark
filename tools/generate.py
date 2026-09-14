#!/usr/bin/env python3
"""Generates the benchmark project for one screenshot testing tool.

    python3 tools/generate.py --tool mugshot
    python3 tools/generate.py --tool paparazzi
    python3 tools/generate.py --tool compose-preview

The screens are identical for every tool and deterministic for a given seed. Only the build
files and the code each tool needs to turn the existing previews into screenshots differ.
"""
import argparse, os, random, shutil, textwrap

ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
PKG = "com.example.scale"

def w(path, text):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w") as f:
        f.write(textwrap.dedent(text).lstrip("\n"))

TOOL = "mugshot"

def module_build(namespace, deps=(), is_ds=False):
    dep_lines = "\n".join(f'    implementation(project("{d}"))' for d in deps)
    if TOOL == "none":
        plugins = ""
        android_extra = ""
        test_deps = ""
    elif TOOL == "mugshot":
        plugins = """
        alias(libs.plugins.ksp)
        alias(libs.plugins.mugshot)"""
        android_extra = ""
        test_deps = ""
    elif TOOL == "paparazzi":
        plugins = """
        alias(libs.plugins.paparazzi)"""
        android_extra = ""
        test_deps = """
        testImplementation(libs.testparameterinjector)"""
    else:
        plugins = """
        alias(libs.plugins.screenshot)"""
        android_extra = """
        experimentalProperties["android.experimental.enableScreenshotTest"] = true"""
        test_deps = """
        screenshotTestImplementation(libs.screenshot.validation.api)
        screenshotTestImplementation(libs.compose.ui.tooling)"""
    return f'''
    plugins {{
        alias(libs.plugins.android.library)
        alias(libs.plugins.kotlin.compose){plugins}
    }}

    android {{
        namespace = "{namespace}"
        compileSdk {{ version = release(libs.versions.compileSdk.get().toInt()) }}
        defaultConfig {{ minSdk {{ version = release(libs.versions.minSdk.get().toInt()) }} }}
        compileOptions {{
            sourceCompatibility(libs.versions.javaTarget.get())
            targetCompatibility(libs.versions.javaTarget.get())
        }}
        buildFeatures {{ compose = true }}{android_extra}
    }}

    androidComponents {{ beforeVariants(selector().withBuildType("release")) {{ it.enable = false }} }}

    dependencies {{
        implementation(libs.compose.ui)
        implementation(libs.compose.foundation)
        implementation(libs.compose.material3)
        implementation(libs.compose.material.icons)
        implementation(libs.compose.ui.tooling.preview)
        implementation(libs.compose.ui.tooling){test_deps}
{dep_lines}
    }}
    '''

def strip_mugshot(source):
    """The same file with the Mugshot annotations removed: the app's own previews, untouched."""
    lines = [
        line for line in source.split("\n")
        if not line.strip().startswith("import uk.co.fractalmotion.mugshot")
        and line.strip() not in ("@Mugshot", "@MugshotMatrix", "@MugshotShrink")
    ]
    return "\n".join(lines)

# The four devices, both appearances and three font scales of Mugshot's @MugshotMatrix, spelled out
# for the tools that have no such annotation. Sizes and densities match Mugshot's device configs.
DEVICES = [
    # name, width dp, height dp, dpi
    ("Phone", 411, 923, 420),
    ("Foldable", 701, 841, 420),
    ("Tablet", 1280, 800, 320),
    ("Landscape", 923, 411, 420),
]
FONT_SCALES = [("Font100", "1f"), ("Font150", "1.5f"), ("Font200", "2f")]

def paparazzi_test(pkg, previews):
    entries = ",\n".join(f"        {p.removesuffix('Preview')}({{ {p}() }})" for p in previews)
    return f'''
package {pkg}

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
) {{
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = device.config.copy(nightMode = nightMode.mode, fontScale = fontScale.scale),
        theme = "android:Theme.Material.Light.NoActionBar",
        renderingMode = preview.renderingMode,
    )

    @Test
    fun snapshot() {{
        paparazzi.snapshot {{ preview.content() }}
    }}

    enum class Preview(
        val content: @Composable () -> Unit,
        val renderingMode: RenderingMode = RenderingMode.NORMAL,
    ) {{
{entries}
    }}

    enum class Device(val config: DeviceConfig) {{
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
    }}

    enum class Appearance(val mode: NightMode) {{ Light(NightMode.NOTNIGHT), Dark(NightMode.NIGHT) }}

    enum class FontScale(val scale: Float) {{ Font100(1f), Font150(1.5f), Font200(2f) }}

    private companion object {{
        val PHONE = DeviceConfig.PIXEL_5.copy(
            screenWidth = 1080, screenHeight = 2424, xdpi = 428, ydpi = 424,
            density = Density.create(420), ratio = ScreenRatio.LONG,
        )
    }}
}}
'''

def compose_preview_test(pkg, previews):
    matrix = []
    for name, w_dp, h_dp, dpi in DEVICES:
        for mode, ui in (("Light", "UI_MODE_NIGHT_NO"), ("Dark", "UI_MODE_NIGHT_YES")):
            for font, scale in FONT_SCALES:
                matrix.append(
                    f'@Preview(name = "{name}_{mode}_{font}", device = "spec:width={w_dp}dp,height={h_dp}dp,dpi={dpi}", '
                    f'uiMode = Configuration.{ui}, fontScale = {scale})'
                )
    matrix_lines = "\n".join(matrix)
    tests = "\n".join(
        f"@PreviewTest\n@ScreenshotMatrix\n@Composable\nfun {p}Screenshot() {{\n    {p}()\n}}\n"
        for p in previews
    )
    return f'''
package {pkg}

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.tools.screenshot.PreviewTest

{matrix_lines}
annotation class ScreenshotMatrix

{tests}'''

# ---------------------------------------------------------------- design system

DS_THEME = f'''
package {PKG}.designsystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF2E6C4D),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFB4F1CE),
    secondary = Color(0xFF4E6355),
    tertiary = Color(0xFF3D6473),
    error = Color(0xFFBA1A1A),
    surfaceVariant = Color(0xFFDCE5DC),
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFF99D5B0),
    onPrimary = Color(0xFF00391F),
    primaryContainer = Color(0xFF145236),
    secondary = Color(0xFFB5CCBB),
    tertiary = Color(0xFFA5CDDE),
    error = Color(0xFFFFB4AB),
    surfaceVariant = Color(0xFF404943),
)

@Composable
public fun AppTheme(content: @Composable () -> Unit) {{
    MaterialTheme(colorScheme = if (isSystemInDarkTheme()) DarkColors else LightColors) {{
        Surface(color = MaterialTheme.colorScheme.background) {{ content() }}
    }}
}}
'''

DS_COMPONENTS = f'''
package {PKG}.designsystem

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material3.Badge
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
public fun SectionHeader(title: String, modifier: Modifier = Modifier) {{
    Text(
        text = title,
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.SemiBold,
        modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp),
    )
}}

@Composable
public fun PrimaryAction(label: String, modifier: Modifier = Modifier) {{
    Button(onClick = {{}}, modifier = modifier) {{ Text(label) }}
}}

@Composable
public fun SecondaryAction(label: String, modifier: Modifier = Modifier) {{
    FilledTonalButton(onClick = {{}}, modifier = modifier) {{ Text(label) }}
}}

@Composable
public fun TertiaryAction(label: String, modifier: Modifier = Modifier) {{
    OutlinedButton(onClick = {{}}, modifier = modifier) {{ Text(label) }}
}}

@Composable
public fun LinkAction(label: String, modifier: Modifier = Modifier) {{
    TextButton(onClick = {{}}, modifier = modifier) {{ Text(label) }}
}}

@Composable
public fun InfoCard(title: String, body: String, modifier: Modifier = Modifier) {{
    Card(modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 6.dp)) {{
        Column(Modifier.padding(16.dp)) {{
            Text(title, style = MaterialTheme.typography.titleMedium)
            Spacer(Modifier.height(4.dp))
            Text(body, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }}
    }}
}}

@Composable
public fun StatCard(label: String, value: String, modifier: Modifier = Modifier) {{
    ElevatedCard(modifier = modifier.padding(6.dp), colors = CardDefaults.elevatedCardColors()) {{
        Column(Modifier.padding(16.dp)) {{
            Text(value, style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
            Text(label, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }}
    }}
}}

@Composable
public fun OutlinedInfo(text: String, modifier: Modifier = Modifier) {{
    OutlinedCard(modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 6.dp)) {{
        Text(text, Modifier.padding(16.dp), style = MaterialTheme.typography.bodyMedium)
    }}
}}

@Composable
public fun Avatar(initials: String, modifier: Modifier = Modifier) {{
    Surface(
        modifier = modifier.size(40.dp),
        shape = CircleShape,
        color = MaterialTheme.colorScheme.primaryContainer,
    ) {{
        Box(contentAlignment = Alignment.Center) {{
            Text(initials, style = MaterialTheme.typography.labelLarge)
        }}
    }}
}}

@Composable
public fun PersonRow(name: String, detail: String, modifier: Modifier = Modifier) {{
    ListItem(
        headlineContent = {{ Text(name) }},
        supportingContent = {{ Text(detail) }},
        leadingContent = {{ Avatar(name.take(2).uppercase()) }},
        modifier = modifier,
    )
}}

@Composable
public fun RatingStars(rating: Int, modifier: Modifier = Modifier) {{
    Row(modifier, horizontalArrangement = Arrangement.spacedBy(2.dp)) {{
        repeat(5) {{ index ->
            Icon(
                imageVector = if (index < rating) Icons.Filled.Star else Icons.Filled.StarBorder,
                contentDescription = null,
                tint = if (index < rating) Color(0xFFF2B01E) else MaterialTheme.colorScheme.outline,
                modifier = Modifier.size(16.dp),
            )
        }}
    }}
}}

@Composable
public fun CountBadge(count: Int, modifier: Modifier = Modifier) {{
    Badge(modifier = modifier) {{ Text(count.toString()) }}
}}

@Composable
public fun StepProgress(fraction: Float, modifier: Modifier = Modifier) {{
    LinearProgressIndicator(progress = {{ fraction }}, modifier = modifier.fillMaxWidth().padding(16.dp))
}}

@Composable
public fun BusyIndicator(modifier: Modifier = Modifier) {{
    Box(modifier.fillMaxWidth().padding(24.dp), contentAlignment = Alignment.Center) {{
        CircularProgressIndicator()
    }}
}}
'''

DS_INPUTS = f'''
package {PKG}.designsystem

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
public fun SearchField(query: String, modifier: Modifier = Modifier) {{
    OutlinedTextField(
        value = query,
        onValueChange = {{}},
        leadingIcon = {{ Icon(Icons.Filled.Search, contentDescription = null) }},
        placeholder = {{ Text("Search") }},
        singleLine = true,
        modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
    )
}}

@Composable
public fun LabelledField(label: String, value: String, modifier: Modifier = Modifier) {{
    TextField(
        value = value,
        onValueChange = {{}},
        label = {{ Text(label) }},
        singleLine = true,
        modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 6.dp),
    )
}}

@Composable
public fun FilterRow(options: List<String>, selected: Int, modifier: Modifier = Modifier) {{
    Row(
        modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 4.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {{
        options.forEachIndexed {{ index, option ->
            ElevatedFilterChip(selected = index == selected, onClick = {{}}, label = {{ Text(option) }})
        }}
    }}
}}

@Composable
public fun TagRow(tags: List<String>, modifier: Modifier = Modifier) {{
    Row(
        modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 4.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {{
        tags.forEachIndexed {{ index, tag ->
            when (index % 3) {{
                0 -> AssistChip(onClick = {{}}, label = {{ Text(tag) }})
                1 -> SuggestionChip(onClick = {{}}, label = {{ Text(tag) }})
                else -> InputChip(selected = false, onClick = {{}}, label = {{ Text(tag) }})
            }}
        }}
    }}
}}

@Composable
public fun ToggleRow(label: String, checked: Boolean, modifier: Modifier = Modifier) {{
    Row(
        modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {{
        Text(label, style = MaterialTheme.typography.bodyLarge)
        Switch(checked = checked, onCheckedChange = {{}})
    }}
}}

@Composable
public fun CheckRow(label: String, checked: Boolean, modifier: Modifier = Modifier) {{
    Row(
        modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {{
        Checkbox(checked = checked, onCheckedChange = {{}})
        Text(label, style = MaterialTheme.typography.bodyMedium)
    }}
}}

@Composable
public fun ChoiceRow(label: String, selected: Boolean, modifier: Modifier = Modifier) {{
    Row(
        modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {{
        RadioButton(selected = selected, onClick = {{}})
        Text(label, style = MaterialTheme.typography.bodyMedium)
    }}
}}

@Composable
public fun AmountSlider(value: Float, modifier: Modifier = Modifier) {{
    Column(modifier.fillMaxWidth().padding(horizontal = 16.dp)) {{
        Slider(value = value, onValueChange = {{}})
    }}
}}
'''

DS_SCAFFOLD = f'''
package {PKG}.designsystem

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

private val NAV_ICONS = listOf(Icons.Filled.Home, Icons.Filled.Favorite, Icons.Filled.Person, Icons.Filled.Settings)
private val NAV_LABELS = listOf("Home", "Saved", "Profile", "Settings")

/** A screen frame: top bar, bottom navigation, optional FAB and tabs, scrolling body. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
public fun AppScreen(
    title: String,
    tabs: List<String> = emptyList(),
    selectedTab: Int = 0,
    selectedNav: Int = 0,
    showFab: Boolean = false,
    content: @Composable () -> Unit,
) {{
    AppTheme {{
        Scaffold(
            topBar = {{ TopAppBar(title = {{ Text(title) }}) }},
            bottomBar = {{
                NavigationBar {{
                    NAV_ICONS.forEachIndexed {{ index, icon ->
                        NavigationBarItem(
                            selected = index == selectedNav,
                            onClick = {{}},
                            icon = {{ Icon(icon, contentDescription = null) }},
                            label = {{ Text(NAV_LABELS[index]) }},
                        )
                    }}
                }}
            }},
            floatingActionButton = {{
                if (showFab) {{
                    FloatingActionButton(onClick = {{}}) {{ Icon(Icons.Filled.Add, contentDescription = null) }}
                }}
            }},
        ) {{ padding: PaddingValues ->
            Column(Modifier.fillMaxSize().padding(padding).verticalScroll(rememberScrollState())) {{
                if (tabs.isNotEmpty()) {{
                    TabRow(selectedTabIndex = selectedTab) {{
                        tabs.forEachIndexed {{ index, tab ->
                            Tab(selected = index == selectedTab, onClick = {{}}, text = {{ Text(tab) }})
                        }}
                    }}
                }}
                content()
            }}
        }}
    }}
}}
'''


DS_CATALOG = f'''
package {PKG}.designsystem

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
internal fun ButtonCatalogPreview() {{
    AppTheme {{
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {{
            PrimaryAction(label = "Primary")
            SecondaryAction(label = "Secondary")
            TertiaryAction(label = "Tertiary")
            LinkAction(label = "Link")
        }}
    }}
}}

@Mugshot
@MugshotMatrix
@MugshotShrink
@Preview
@Composable
internal fun CardCatalogPreview() {{
    AppTheme {{
        Column(Modifier.padding(8.dp)) {{
            InfoCard(title = "Info card", body = "Supporting text on a filled card.")
            OutlinedInfo(text = "Outlined card with a single line of text.")
            Row {{
                StatCard(label = "Open", value = "24")
                StatCard(label = "Closed", value = "108")
            }}
        }}
    }}
}}

@Mugshot
@MugshotMatrix
@MugshotShrink
@Preview
@Composable
internal fun SelectionCatalogPreview() {{
    AppTheme {{
        Column(Modifier.padding(8.dp)) {{
            ToggleRow(label = "Switch", checked = true)
            CheckRow(label = "Checkbox", checked = true)
            ChoiceRow(label = "Radio", selected = true)
            AmountSlider(value = 0.6f)
        }}
    }}
}}

@Mugshot
@MugshotMatrix
@MugshotShrink
@Preview
@Composable
internal fun ChipCatalogPreview() {{
    AppTheme {{
        Column(Modifier.padding(8.dp)) {{
            TagRow(tags = listOf("Assist", "Suggestion", "Input"))
            FilterRow(options = listOf("All", "Recent", "Shared"), selected = 1)
        }}
    }}
}}

@Mugshot
@MugshotMatrix
@MugshotShrink
@Preview
@Composable
internal fun FieldCatalogPreview() {{
    AppTheme {{
        Column(Modifier.padding(8.dp)) {{
            SearchField(query = "")
            LabelledField(label = "Full name", value = "Ada Lovelace")
        }}
    }}
}}

@Mugshot
@MugshotMatrix
@MugshotShrink
@Preview
@Composable
internal fun ContentCatalogPreview() {{
    AppTheme {{
        Column(Modifier.padding(8.dp)) {{
            SectionHeader(title = "Section header")
            PersonRow(name = "Grace Hopper", detail = "Signed in")
            RatingStars(rating = 4, modifier = Modifier.padding(16.dp))
            CountBadge(count = 12, modifier = Modifier.padding(16.dp))
            StepProgress(fraction = 0.45f)
            BusyIndicator()
        }}
    }}
}}
'''

# ---------------------------------------------------------------- content banks

NOUNS = ["Order", "Invoice", "Playlist", "Route", "Workout", "Recipe", "Booking", "Ticket", "Album",
         "Portfolio", "Shipment", "Lesson", "Habit", "Budget", "Contact", "Device", "Article",
         "Reservation", "Subscription", "Payment", "Expense", "Report", "Project", "Task"]
ADJS = ["Recent", "Archived", "Shared", "Pending", "Draft", "Featured", "Nearby", "Weekly", "Team"]
PEOPLE = ["Ada Lovelace", "Grace Hopper", "Alan Turing", "Katherine Johnson", "Linus Torvalds",
          "Barbara Liskov", "Ken Thompson", "Radia Perlman", "Margaret Hamilton", "Dennis Ritchie"]
BODIES = ["Updated a few minutes ago", "Shared with three people", "Scheduled for tomorrow",
          "Waiting on approval", "Synced across your devices", "Expires at the end of the month",
          "No changes since last week", "Delivered to the London office"]
DOMAINS = ["catalog", "orders", "profile", "settings", "search", "checkout", "library", "inbox",
           "reports", "billing", "devices", "activity", "teams", "alerts", "storage", "calendar",
           "media", "notes", "tasks", "travel", "fitness", "finance", "social", "support",
           "onboarding", "gallery", "messages", "discover", "account"]

# ---------------------------------------------------------------- screen shapes

def screen_list(name, rnd):
    rows = "\n".join(
        f'            PersonRow(name = "{rnd.choice(PEOPLE)}", detail = "{rnd.choice(BODIES)}")'
        for _ in range(rnd.randint(4, 7)))
    tags = ", ".join(f'"{rnd.choice(ADJS)}"' for _ in range(3))
    return f'''
        SearchField(query = "")
        FilterRow(options = listOf({tags}), selected = {rnd.randint(0, 2)})
{rows}
'''

def screen_detail(name, rnd):
    return f'''
        InfoCard(
            title = "{rnd.choice(ADJS)} {rnd.choice(NOUNS).lower()}",
            body = "{rnd.choice(BODIES)}",
        )
        RatingStars(rating = {rnd.randint(2, 5)}, modifier = Modifier.padding(horizontal = 16.dp))
        OutlinedInfo(text = "{rnd.choice(BODIES)}")
        TagRow(tags = listOf("{rnd.choice(ADJS)}", "{rnd.choice(ADJS)}", "{rnd.choice(ADJS)}"))
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {{
            PrimaryAction(label = "Confirm")
            TertiaryAction(label = "Cancel")
        }}
'''

def screen_form(name, rnd):
    names = rnd.sample(["Full name", "Email", "Address", "Reference", "Note", "Phone"], rnd.randint(2, 4))
    fields = "\n".join(f'        LabelledField(label = "{label}", value = "")' for label in names)
    return f'''
        SectionHeader(title = "Details")
{fields}
        CheckRow(label = "Send me a copy", checked = {str(rnd.choice([True, False])).lower()})
        ChoiceRow(label = "Standard delivery", selected = true)
        ChoiceRow(label = "Express delivery", selected = false)
        AmountSlider(value = {rnd.choice(['0.25f', '0.5f', '0.75f'])})
        PrimaryAction(label = "Submit", modifier = Modifier.padding(16.dp))
'''

def screen_dashboard(name, rnd):
    stats = "\n".join(
        f'            StatCard(label = "{rnd.choice(ADJS)} {rnd.choice(NOUNS).lower()}s", value = "{rnd.randint(3, 999)}")'
        for _ in range(3))
    return f'''
        SectionHeader(title = "This week")
        Row(Modifier.padding(horizontal = 10.dp)) {{
{stats}
        }}
        StepProgress(fraction = {rnd.choice(['0.3f', '0.6f', '0.85f'])})
        InfoCard(title = "{rnd.choice(NOUNS)} summary", body = "{rnd.choice(BODIES)}")
'''

def screen_settings(name, rnd):
    labels = rnd.sample(["Notifications", "Dark theme", "Sync on cellular", "Analytics", "Auto-play", "Haptics"], rnd.randint(3, 5))
    toggles = "\n".join(
        f'        ToggleRow(label = "{label}", checked = {str(rnd.choice([True, False])).lower()})'
        for label in labels)
    return f'''
        SectionHeader(title = "Preferences")
{toggles}
        SectionHeader(title = "Account")
        PersonRow(name = "{rnd.choice(PEOPLE)}", detail = "Signed in")
        LinkAction(label = "Sign out", modifier = Modifier.padding(horizontal = 8.dp))
'''

def screen_empty(name, rnd):
    return f'''
        BusyIndicator()
        OutlinedInfo(text = "Nothing here yet. {rnd.choice(BODIES)}.")
        SecondaryAction(label = "Refresh", modifier = Modifier.padding(16.dp))
'''

SHAPES = [
    (screen_list, "{adj} {noun}s"),
    (screen_detail, "{noun} details"),
    (screen_form, "New {noun}"),
    (screen_dashboard, "{noun} overview"),
    (screen_settings, "Settings"),
    (screen_empty, "{adj} {noun}s"),
]

def screen_file(pkg, name, body, title, tabs, rnd):
    tab_arg = ""
    if tabs:
        tab_list = ", ".join(f'"{t}"' for t in tabs)
        tab_arg = f'\n        tabs = listOf({tab_list}),\n        selectedTab = {rnd.randint(0, len(tabs) - 1)},'
    return f'''
package {pkg}

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uk.co.fractalmotion.mugshot.annotations.Mugshot
import uk.co.fractalmotion.mugshot.annotations.MugshotMatrix
import {PKG}.designsystem.*

@Composable
public fun {name}() {{
    AppScreen(
        title = "{title}",{tab_arg}
        selectedNav = {rnd.randint(0, 3)},
        showFab = {str(rnd.choice([True, False])).lower()},
    ) {{
{body}
    }}
}}

@Mugshot
@MugshotMatrix
@Preview
@Composable
internal fun {name}Preview() {{
    {name}()
}}
'''

# ---------------------------------------------------------------- screenshot code per tool

def write_screenshot_code(module, pkg, previews, shrink=False):
    """What each tool needs, beyond the previews, to screenshot them. Mugshot needs nothing."""
    pkg_path = pkg.split(".")
    if TOOL == "paparazzi":
        source = paparazzi_test(pkg, previews)
        if shrink:
            source = source.replace("() }),", "() }, RenderingMode.SHRINK),").replace("() })\n", "() }, RenderingMode.SHRINK)\n")
        w(os.path.join(ROOT, module, "src/test/kotlin", *pkg_path, "ScreenshotTest.kt"), source)
    elif TOOL == "compose-preview":
        w(os.path.join(ROOT, module, "src/screenshotTest/kotlin", *pkg_path, "ScreenshotTest.kt"),
          compose_preview_test(pkg, previews))

# ---------------------------------------------------------------- driver

def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--features", type=int, default=29)
    ap.add_argument("--min-screens", type=int, default=5)
    ap.add_argument("--max-screens", type=int, default=15)
    ap.add_argument("--seed", type=int, default=20260908)
    ap.add_argument("--tool", choices=["none", "mugshot", "paparazzi", "compose-preview"], default="mugshot")
    args = ap.parse_args()
    global TOOL
    TOOL = args.tool

    rnd = random.Random(args.seed)

    for stale in ("designsystem",) + tuple(f"feature-{d}" for d in DOMAINS):
        p = os.path.join(ROOT, stale)
        if os.path.isdir(p):
            shutil.rmtree(p)

    # design system
    ds_pkg_dir = os.path.join(ROOT, "designsystem/src/main/kotlin", *f"{PKG}.designsystem".split("."))
    w(os.path.join(ROOT, "designsystem/build.gradle.kts"), module_build(f"{PKG}.designsystem"))
    w(os.path.join(ds_pkg_dir, "Theme.kt"), DS_THEME)
    w(os.path.join(ds_pkg_dir, "Components.kt"), DS_COMPONENTS)
    w(os.path.join(ds_pkg_dir, "Inputs.kt"), DS_INPUTS)
    w(os.path.join(ds_pkg_dir, "AppScreen.kt"), DS_SCAFFOLD)
    catalog = DS_CATALOG if TOOL == "mugshot" else strip_mugshot(DS_CATALOG)
    w(os.path.join(ds_pkg_dir, "Catalog.kt"), catalog)
    catalog_previews = [line.split("fun ")[1].split("(")[0] for line in DS_CATALOG.split("\n") if "internal fun " in line]
    write_screenshot_code("designsystem", f"{PKG}.designsystem", catalog_previews, shrink=True)

    modules = [":designsystem"]
    total_screens = 0

    domains = DOMAINS[: args.features]
    for domain in domains:
        mod = f"feature-{domain}"
        pkg = f"{PKG}.{domain}"
        pkg_dir = os.path.join(ROOT, mod, "src/main/kotlin", *pkg.split("."))
        w(os.path.join(ROOT, mod, "build.gradle.kts"), module_build(pkg, deps=(":designsystem",)))
        count = rnd.randint(args.min_screens, args.max_screens)
        previews = []
        for i in range(count):
            shape, title_template = SHAPES[(i + len(domain)) % len(SHAPES)]
            noun = rnd.choice(NOUNS)
            name = f"{domain.capitalize()}{noun}{i}Screen"
            title = title_template.format(adj=rnd.choice(ADJS), noun=noun.lower()).capitalize()
            tabs = [rnd.choice(ADJS), rnd.choice(ADJS)] if i % 3 == 0 else []
            source = screen_file(pkg, name, shape(name, rnd), title, tabs, rnd)
            w(os.path.join(pkg_dir, f"{name}.kt"), source if TOOL == "mugshot" else strip_mugshot(source))
            previews.append(f"{name}Preview")
        write_screenshot_code(mod, pkg, previews)
        total_screens += count
        modules.append(f":{mod}")

    includes = "\n".join(f'    "{m}",' for m in modules)
    w(os.path.join(ROOT, "settings.gradle.kts"), f'''
    pluginManagement {{
        repositories {{
            google()
            mavenCentral()
            gradlePluginPortal()
        }}
    }}

    @Suppress("UnstableApiUsage")
    dependencyResolutionManagement {{
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {{
            google()
            mavenCentral()
        }}
    }}

    rootProject.name = "screenshot-testing-benchmark"

    include(
{includes}
    )
    ''')

    properties = """
    org.gradle.jvmargs=-Xmx6g -XX:MaxMetaspaceSize=1g -Dfile.encoding=UTF-8
    org.gradle.parallel=true
    org.gradle.caching=true
    org.gradle.configuration-cache=true
    android.useAndroidX=true
    android.nonTransitiveRClass=true
    kotlin.code.style=official
    """
    if TOOL == "compose-preview":
        properties += "android.experimental.enableScreenshotTest=true\n"
    w(os.path.join(ROOT, "gradle.properties"), properties)

    tool_plugins = {
        "none": "",
        "mugshot": "\n        alias(libs.plugins.ksp) apply false\n        alias(libs.plugins.mugshot) apply false",
        "paparazzi": "\n        alias(libs.plugins.paparazzi) apply false",
        "compose-preview": "\n        alias(libs.plugins.screenshot) apply false",
    }[TOOL]
    w(os.path.join(ROOT, "build.gradle.kts"), f'''
    plugins {{
        alias(libs.plugins.android.library) apply false
        alias(libs.plugins.kotlin.compose) apply false{tool_plugins}
    }}
    ''')

    print(f"modules: {len(modules)} ({len(domains)} feature + 1 design system)")
    print(f"screens: {total_screens}")

if __name__ == "__main__":
    main()
