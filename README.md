> Mirror Policy: This repository is an automated mirror of the monorepo https://github.com/amitgaikwad2837/SDK.
>
> Do not push changes directly here. All changes must be made in the SDK monorepo and synced by workflow.
> Pull requests opened in this repo are for review visibility only and may be overwritten by the next sync.
# Android Vision Assistance SDK

## 📦 Registry & Repository

- **Maven Central**: [io.github.amitgaikwad2837:android-vision-assistance-sdk](https://central.sonatype.com/artifact/io.github.amitgaikwad2837/android-vision-assistance-sdk)
- **GitHub**: [amitgaikwad2837/android-vision-assistance-sdk](https://github.com/amitgaikwad2837/android-vision-assistance-sdk)

## Overview

AI-powered vision assistance for blind and low vision users. Provides real-time scene descriptions, object detection, text reading, navigation assistance, and activity recognition.

## Installation

Add the Maven dependency:

~~~kotlin
dependencies {
  implementation("io.github.amitgaikwad2837:android-vision-assistance-sdk:0.0.9")
}
~~~

## Integration Example

~~~kotlin
import com.sdk.vision.VisionAssistanceSDK

class ExampleUsage {
    fun setup() {
        val sdk = VisionAssistanceSDK()
        // Configure and call SDK APIs here based on your app flow.
    }
}
~~~

## Feature Highlights

- object-detection
- door-detection
- stair-detection
- obstacle-detection
- distance-estimation
- voice-feedback

## Android Permissions

- CAMERA
- INTERNET

## Development

~~~bash
./gradlew build
./gradlew test
~~~

## License

MIT

