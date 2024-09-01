pluginManagement {
    repositories {
//        maven(url = "https://repo.ito.gov.ir/gradle/maven_central/")
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
//        maven(url = "https://repo.ito.gov.ir/gradle/maven_central/")
        google()
        mavenCentral()
    }
}

rootProject.name = "Ping"
include(":app")
 