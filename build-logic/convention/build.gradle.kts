plugins {
    `kotlin-dsl`
}

buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
    }
}

group = "com.github.marzic93.sandbox.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidLibrary") {
            id = "sandbox.android.library"
            implementationClass = "LibraryConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "sandbox.android.library.compose"
            implementationClass = "LibraryComposeConventionPlugin"
        }

        register("androidApplication") {
            id = "sandbox.android.application"
            implementationClass = "ApplicationConventionPlugin"
        }

        register("androidApplicationCompose") {
            id = "sandbox.android.application.compose"
            implementationClass = "ApplicationComposeConventionPlugin"
        }
    }
}
