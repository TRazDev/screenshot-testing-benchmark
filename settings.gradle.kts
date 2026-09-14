pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "screenshot-testing-benchmark"

include(
":designsystem",
":feature-catalog",
":feature-orders",
":feature-profile",
":feature-settings",
":feature-search",
":feature-checkout",
":feature-library",
":feature-inbox",
":feature-reports",
":feature-billing",
":feature-devices",
":feature-activity",
":feature-teams",
":feature-alerts",
":feature-storage",
":feature-calendar",
":feature-media",
":feature-notes",
":feature-tasks",
":feature-travel",
":feature-fitness",
":feature-finance",
":feature-social",
":feature-support",
":feature-onboarding",
":feature-gallery",
":feature-messages",
":feature-discover",
":feature-account",
)
