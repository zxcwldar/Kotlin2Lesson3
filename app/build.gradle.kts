plugins {

    // Application
    id("com.android.application")

    // Kotlin
    id("kotlin-android")

    // Kapt
    id("kotlin-kapt")

    // Navigation SafeArgs
    id("androidx.navigation.safeargs.kotlin")

    // Hilt
    id("com.google.dagger.hilt.android")


    id("kotlin-parcelize")

}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.example.movieapi"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    packagingOptions {
        resources.pickFirsts.add("META-INF/*")
        resources.excludes.add("META-INF/DEPENDENCIES")
        resources.excludes.add("META-INF/LICENSE")
        resources.excludes.add("META-INF/LICENSE.txt")
        resources.excludes.add("META-INF/license.txt")
        resources.excludes.add("META-INF/NOTICE")
        resources.excludes.add("META-INF/NOTICE.txt")
        resources.excludes.add("META-INF/notice.txt")
        resources.excludes.add("META-INF/ASL2.0")
        resources.excludes.add("META-INF/*")
    }
    //ViewBinding
    buildFeatures.viewBinding = true
}

dependencies {
    // UI Components
    implementation(libs.bundles.uiComponents)


    // Core
    implementation(libs.android.core)

    // Activity
    implementation(libs.activity.activity)

    // Fragment
    implementation(libs.fragment.fragment)

    // Lifecycle
    implementation(libs.bundles.lifecycleBundle)

    // Navigation
    implementation(libs.bundles.navigationBundle)

    // Retrofit
    implementation(libs.bundles.retrofitBundle)

    // OkHttpClient
    implementation("com.squareup.okhttp3:logging-interceptor")
    implementation("com.squareup.okhttp3:okhttp")
    implementation(libs.okHttp.bom)

    // Hilt
    implementation(libs.hilt.hilt)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    kapt(libs.hilt.compiler)

    // Legacy Support
    implementation(libs.legacySupport.legacySupport)

    // Glide
    implementation(libs.glide.glide)

    // SplashScreen
    implementation(libs.ui.splashScreen)

    // Room
    implementation(libs.bundles.roomBundle)
    kapt(libs.room.compiler)

    implementation("com.jakewharton.timber:timber:5.0.1")
}