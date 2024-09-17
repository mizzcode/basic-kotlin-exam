package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val lengthString = string.length
    val middleString = lengthString / 2

    return if (lengthString % 2 == 0) {
        string.substring(middleString -1, middleString +1)
    } else {
        string.substring(middleString, middleString +1)
    }

}