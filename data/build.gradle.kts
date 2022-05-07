plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("kotlin-kapt")
}
dependencies {
    implementation(project(":domain"))
    implementation(libs.coroutines.android)
    implementation(libs.bundles.retrofit)
    implementation(libs.bundles.okHttpBundle)
    implementation(libs.bundles.room)
    kapt(libs.room.compiler)

}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}