package com.leozhi.testcase.array

/**
 * @author leozhi
 */
fun toIntArray(string: String): IntArray {
    return string.subSequence(1, string.length - 1).split(",").map{ it.toInt() }.toIntArray()
}

fun String.toTwoDimensionalArray(): Array<IntArray> {
    return this.subSequence(2, this.length - 2).split("],[").map { string ->
        string.split(",").map { it.toInt() }.toIntArray()
    }.toTypedArray()
}