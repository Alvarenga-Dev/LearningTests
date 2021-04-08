package com.alvarengadev.learningtests.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username return false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Peter",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Lucas",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Park",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password was repeat incorrectly return false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Camilly",
            "1234",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits return false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Camilly",
            "12",
            "12"
        )
        assertThat(result).isFalse()
    }

}