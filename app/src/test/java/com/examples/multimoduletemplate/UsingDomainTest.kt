package com.examples.multimoduletemplate

import com.examples.domain.Password
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UsingDomainTest {
    @Test
    fun `given somethingLong when isValid then return True`() {
        // Arrange
        val input = "somethingLong"
        val expected = true
        val password = Password(input)

        // Act
        val actual = password.isValid

        // Assert
        assertEquals(expected, actual)
    }
}
