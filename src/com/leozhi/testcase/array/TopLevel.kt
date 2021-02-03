package com.leozhi.testcase.array

/**
 * @author leozhi
 */
fun toIntArray(string: String): IntArray {
    return string.subSequence(1, string.length - 1).split(",").map{ it.toInt() }.toIntArray()
}