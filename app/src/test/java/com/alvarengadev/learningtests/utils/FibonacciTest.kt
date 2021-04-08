package com.alvarengadev.learningtests.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FibonacciTest {

    @Test
    fun `fib(0) is equals to 0`() {
        val fibonacciThe0 = Fibonacci.fib(0)
        assertThat(fibonacciThe0).isEqualTo(0L)
    }

    @Test
    fun `fib(1) is equals to 1`() {
        val fibonacciThe1 = Fibonacci.fib(1)
        assertThat(fibonacciThe1).isEqualTo(1L)
    }

    @Test
    fun `fib(n) is equals to fib(n-2) + fib(n-1)`() {
        val n = 10
        val fibN = Fibonacci.fib(n)
        val verifyCalculatorFibonacci = Fibonacci.fib(n - 2) + Fibonacci.fib(n - 1)

        assertThat(fibN).isEqualTo(verifyCalculatorFibonacci)
    }

}