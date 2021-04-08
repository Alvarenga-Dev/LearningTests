package com.alvarengadev.learningtests.utils

object RegistrationUtil {

    private val existingUsers = listOf("Lucas", "Camilly")

    /**
     * the input invalid is...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the same as the real password
     * .. the password contains less than 2 digits
     */

    fun validationRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        return if (username.isEmpty() || password.isEmpty()) {
            false
        }  else if (username in existingUsers) {
            false
        } else if (password != confirmedPassword) {
            false
        } else password.count { it.isDigit() } >= 2
    }
}