package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val listOfNumber = number.toString().toList().sorted()

    val min = listOfNumber.first().digitToInt()
    val max = listOfNumber.last().digitToInt()

    val result = min + max

    return result
}