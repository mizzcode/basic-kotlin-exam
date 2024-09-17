package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    val sorted = numbers.sortedDescending().take(3).sum()
    return sorted
}