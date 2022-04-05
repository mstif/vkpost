package ru.netology

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun update_Error() {
        val result = WallService.update(Post())
        Assert.assertEquals(true, result)
    }
}