package com.github.marzic93.sandbox

import org.gradle.api.JavaVersion

object Config {
    val android = AndroidConfigs(
        minSdk = 26,
        targetSdk = 33,
        compileSdkVersion = 33
    )

    val jvm = JvmConfig(
        javaVersion = JavaVersion.VERSION_17,
        kotlinJvm = "17",
        freeCompilerArgs = listOf(
            "-opt-in=kotlin.RequiresOptIn",
            // Enable experimental coroutines APIs, including Flow
            "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
            "-opt-in=kotlinx.coroutines.FlowPreview",
            "-opt-in=kotlin.Experimental",
        )
    )
}

class AndroidConfigs(
    val minSdk: Int,
    val targetSdk: Int,
    val compileSdkVersion: Int
)

class JvmConfig(
    val javaVersion: JavaVersion,
    val kotlinJvm: String,
    val freeCompilerArgs: List<String>
)