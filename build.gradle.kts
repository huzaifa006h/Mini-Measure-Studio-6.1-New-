plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.huzaifa.minimeasurestudio"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.huzaifa.minimeasurestudio"
        minSdk = 23
        targetSdk = 35
        versionCode = 61
        versionName = "6.1"
    }
}


dependencies {
    implementation("androidx.webkit:webkit:1.12.1")
}
