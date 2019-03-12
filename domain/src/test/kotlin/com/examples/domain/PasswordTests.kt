package com.examples.domain

import org.junit.Assert.*
import org.junit.Test

class PasswordTests {

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