# Android Vision Assistance SDK

## Overview

Real-time vision assistance for visually impaired users

## Installation

Add the Maven dependency once artifacts are published:

~~~kotlin
dependencies {
  implementation("io.github.amitgaikwad2837:android-vision-assistance-sdk:1.0.0")
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
