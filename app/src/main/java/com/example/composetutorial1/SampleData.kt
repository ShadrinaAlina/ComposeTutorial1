package com.example.composetutorial1

object SampleData {
    // Sample converstation data
    val conversationSample = listOf(
        MainActivity.Message(
            "User",
            "Test...Test..Test..."
        ),
        MainActivity.Message(
            "Colleague",
            "List of Android versions:\n" +
                    "Android KitKat (API 19)\n" +
                    "Android Lollipop (API 21)\n" +
                    "Android Marshmallow (API 23)\n" +
                    "Android Nougat (API 24)\n" +
                    "Android Oreo (API 26)\n" +
                    "Android Pie (API 28)\n" +
                    "Android 10 (API 29)\n" +
                    "Android 11 (API 30)\n" +
                    "Android 12 (API 31)\n"
        ),
        MainActivity.Message(
            "User",
            "I think Kotlin is my favorite programming language.\n" +
                    "It's so much fun!"
        ),
        MainActivity.Message(
            "Colleague",
            "Searching for alternatives to XML layouts..."
        ),
        MainActivity.Message(
            "User",
            "Hey, take a look at Jetpack Compose, it's great!\n" +
                    "It's the Android's modern toolkit for building native UI." +
                    "It simplifies and accelerates UI development on Android." +
                    "Less code, powerful tools, and intuitive Kotlin APIs :)"
        ),
        MainActivity.Message(
            "Colleague",
            "It's available from API 21+ :)"
        ),
        MainActivity.Message(
            "User",
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
        ),
        MainActivity.Message(
            "Colleague",
            "Android Studio next version's name is Arctic Fox"
        ),
        MainActivity.Message(
            "User",
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
        ),
        MainActivity.Message(
            "Colleague",
            "I didn't know you can now run the emulator directly from Android Studio"
        ),
        MainActivity.Message(
            "User",
            "Compose Previews are great to check quickly how a composable layout looks like"
        ),
        MainActivity.Message(
            "Colleague",
            "Previews are also interactive after enabling the experimental setting"
        ),
        MainActivity.Message(
            "User",
            "Have you tried writing build.gradle with KTS?"
        ),
    )
}
