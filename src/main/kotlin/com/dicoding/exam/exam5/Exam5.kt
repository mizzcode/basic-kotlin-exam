package com.dicoding.exam.exam5

import kotlinx.coroutines.delay

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000L)
    return valueA + valueB
}

// TODO 2
suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2000L)
    return valueA * valueB
}
