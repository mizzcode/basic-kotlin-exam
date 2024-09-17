package com.dicoding.exam.exam2

// TODO 1
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    return when (valueC != null) {
        true -> {
            valueA + (valueB - valueC)
        }
        false -> {
            valueA + (valueB - 50)
        }
    }
}

// TODO 2
fun result(result: Int): String {
    return "Result is $result"
}