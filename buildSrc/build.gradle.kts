plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://plugins.gradle.org/m2/")
}

object PluginsVersions {
    const val GRADLE_ANDROID = "8.2.1"
    const val UPDATE_VERSIONS = "0.49.0"
    const val KOTLIN = "1.9.22"
    const val NAVIGATION = "2.7.6"
    const val SPOTLESS = "5.7.0"
    const val DETEKT = "1.23.4"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginsVersions.GRADLE_ANDROID}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginsVersions.KOTLIN}")
    implementation("com.github.ben-manes:gradle-versions-plugin:${PluginsVersions.UPDATE_VERSIONS}")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:${PluginsVersions.NAVIGATION}")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:${PluginsVersions.SPOTLESS}")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${PluginsVersions.DETEKT}")
}
