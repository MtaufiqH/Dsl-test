/**
 * Created By Taufiq on 6/3/2021.
 *
 */

object DefaultConfig{

    const val applicationId = "taufiq.apps.kotlindsltest"
    const val minSdk = 22
    const val targetSdk = 30
    const val buildTools = "30.0.3"
    const val compileSdk = 30

    const val testRunner = "androidx.test.runner.AndroidJUnitRunner"

}

object Release {
    const val versionCode = 1
    const val versionName = "1.0"
}

object Version {

    const val kotlinVersion = "1.4.21"
    const val coreKtxVersion = "1.5.0"
    const val appCompatVersion = "1.3.0"
    const val materialVersion = "1.3.0"
    const val constraintVersion = "2.0.4"
    const val junitVersion = "4.13.2"
    const val extJunitVersion = "1.1.2"
    const val coreEspressoVersion = "3.3.0"
    const val glideVersion = "4.12.0"
    const val gradleVersion = "4.1.3"

}

object Dependencies {
    //core
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlinVersion}"
    const val coreKtx = "androidx.core:core-ktx:${Version.coreKtxVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Version.appCompatVersion}"
    const val materialDesign = "com.google.android.material:material:${Version.materialVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintVersion}"
    const val glide = "com.github.bumptech.glide:glide:${Version.glideVersion}"

    // testing.
    const val jUnit =  "junit:junit:${Version.junitVersion}"
    const val extJunit =  "androidx.test.ext:junit:${Version.extJunitVersion}"
    const val espresso =  "androidx.test.espresso:espresso-core:${Version.coreEspressoVersion}"
}
