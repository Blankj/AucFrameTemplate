class Config {

    static applicationId = 'com.blankj.aucframe'            // TODO: MODIFY
    static appName = 'AucFrame'                             // TODO: MODIFY

    static compileSdkVersion = 29                           // TODO: MODIFY
    static minSdkVersion = 21                               // TODO: MODIFY
    static targetSdkVersion = 29                            // TODO: MODIFY
    static versionCode = 1_000_000                          // TODO: MODIFY
    static versionName = '1.0.0'// E.g. 1.9.72 => 1,009,072 // TODO: MODIFY

    static gradlePluginVersion = '3.6.3'
    static kotlinVersion = '1.3.71'
    static androidxVersion = '1.0.0'

    static depConfig = [
            plugin_gradle      : "com.android.tools.build:gradle:$gradlePluginVersion",
            plugin_kotlin      : "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion",

            androidx_appcompat : "androidx.appcompat:appcompat:$androidxVersion",
            androidx_material  : "com.google.android.material:material:$androidxVersion",
            androidx_constraint: "androidx.constraintlayout:constraintlayout:1.1.3",
            androidx_multidex  : "androidx.multidex:multidex:2.0.0",

            kotlin             : "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion",
            kotlinx            : 'androidx.core:core-ktx:1.2.0',

            utilcode           : "com.blankj:utilcode:1.28.4",
            free_proguard      : "com.blankj:free-proguard:1.0.1",
            swipe_panel        : "com.blankj:swipe-panel:1.1",

            leakcanary         : "com.squareup.leakcanary:leakcanary-android:2.1",
    ]
}