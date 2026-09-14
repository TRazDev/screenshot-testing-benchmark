package com.example.scale.designsystem

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
) {
    AppTheme {
        Scaffold(
            topBar = { TopAppBar(title = { Text(title) }) },
            bottomBar = {
                NavigationBar {
                    NAV_ICONS.forEachIndexed { index, icon ->
                        NavigationBarItem(
                            selected = index == selectedNav,
                            onClick = {},
                            icon = { Icon(icon, contentDescription = null) },
                            label = { Text(NAV_LABELS[index]) },
                        )
                    }
                }
            },
            floatingActionButton = {
                if (showFab) {
                    FloatingActionButton(onClick = {}) { Icon(Icons.Filled.Add, contentDescription = null) }
                }
            },
        ) { padding: PaddingValues ->
            Column(Modifier.fillMaxSize().padding(padding).verticalScroll(rememberScrollState())) {
                if (tabs.isNotEmpty()) {
                    TabRow(selectedTabIndex = selectedTab) {
                        tabs.forEachIndexed { index, tab ->
                            Tab(selected = index == selectedTab, onClick = {}, text = { Text(tab) })
                        }
                    }
                }
                content()
            }
        }
    }
}
