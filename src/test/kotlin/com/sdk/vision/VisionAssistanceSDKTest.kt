package com.sdk.vision

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class VisionAssistanceSDKTest {
    @Test
    fun testVisionConfig() {
        val config = VisionConfig(
            enableObjectDetection = true,
            enableVoiceFeedback = true,
            confidenceThreshold = 0.75f
        )
        
        assertEquals(true, config.enableObjectDetection)
        assertEquals(0.75f, config.confidenceThreshold)
    }

    @Test
    fun testDetectedObject() {
        val obj = DetectedObject(
            label = "Person",
            confidence = 0.98f,
            distance = 2.5f
        )
        
        assertEquals("Person", obj.label)
        assertEquals(0.98f, obj.confidence)
        assertEquals(2.5f, obj.distance)
    }

    @Test
    fun testObstacle() {
        val obstacle = Obstacle(
            type = "Door",
            distance = 1.5f,
            direction = "ahead"
        )
        
        assertEquals("Door", obstacle.type)
        assertEquals(1.5f, obstacle.distance)
    }

    @Test
    fun testVisionConfigDefaults() {
        val config = VisionConfig()
        assertEquals(true, config.enableObjectDetection)
        assertEquals(true, config.enableObstacleDetection)
        assertEquals(true, config.enableDistanceEstimation)
        assertEquals(true, config.enableVoiceFeedback)
        assertEquals(0.7f, config.confidenceThreshold)
    }

    @Test
    fun testDetectedObjectTypes() {
        val objects = listOf(
            DetectedObject("Person", 0.95f, distance = 2.0f),
            DetectedObject("Chair", 0.87f, distance = 1.5f),
            DetectedObject("Door", 0.92f, distance = 3.0f)
        )
        
        assertEquals(3, objects.size)
        assertEquals(0.95f, objects[0].confidence)
    }

    @Test
    fun testObstacleTypes() {
        val obstacles = listOf(
            Obstacle("Stair", 2.0f, "ahead"),
            Obstacle("Wall", 1.0f, "right"),
            Obstacle("Person", 1.5f, "left")
        )
        
        assertEquals(3, obstacles.size)
        assertTrue(obstacles.any { it.type == "Stair" })
    }

    @Test
    fun testBounds() {
        val bounds = Bounds(x = 10, y = 20, width = 100, height = 150)
        assertEquals(10, bounds.x)
        assertEquals(20, bounds.y)
        assertEquals(100, bounds.width)
        assertEquals(150, bounds.height)
    }

    @Test
    fun testVisionEventTypes() {
        assertEquals(4, VisionEventType.values().size)
        assertTrue(VisionEventType.values().contains(VisionEventType.CAMERA_STARTED))
        assertTrue(VisionEventType.values().contains(VisionEventType.OBJECTS_DETECTED))
        assertTrue(VisionEventType.values().contains(VisionEventType.OBSTACLE_DETECTED))
    }

    @Test
    fun testDetectionResultWithBounds() {
        val bounds = Bounds(50, 50, 200, 200)
        val object1 = DetectedObject(
            label = "Person",
            confidence = 0.98f,
            bounds = bounds,
            distance = 3.5f
        )
        
        assertEquals(50, object1.bounds?.x)
        assertEquals(3.5f, object1.distance)
    }
}
