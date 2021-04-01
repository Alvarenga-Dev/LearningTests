package com.alvarengadev.learningtests

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.alvarengadev.learningtests.models.User
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class UserTest {
    @Test
    fun userNotCreateAccount() {
        val user = User(
            "Lucas Alvarenga",
            17
        )
        val isCreate = user.years >= 18
        assertFalse(isCreate)
    }

    @Test
    fun userCreateAccount() {
        val user = User(
            "Mateus Silva",
            25
        )
        val isCreate = user.years >= 18
        assertTrue(isCreate)
    }
}