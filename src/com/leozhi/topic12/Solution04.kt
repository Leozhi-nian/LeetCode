package com.leozhi.topic12

/**
 * @author leozhi
 * 循环
 * 通过
 * 272ms
 */
class Solution04 {
    fun intToRoman(num: Int): String {
        val stringBuilder = StringBuilder()
        var n = num
        while (n != 0) {
            when {
                n >= 1000 -> {
                    stringBuilder.append("M".repeat(n / 1000))
                    n %= 1000
                }
                n >= 900 -> {
                    stringBuilder.append("CM")
                    n %= 900
                }
                n >= 500 -> {
                    stringBuilder.append("D")
                    n %= 500
                }
                n >= 400 -> {
                    stringBuilder.append("CD")
                    n %= 400
                }
                n >= 100 -> {
                    stringBuilder.append("C".repeat(n / 100))
                    n %= 100
                }
                n >= 90 -> {
                    stringBuilder.append("XC")
                    n %= 90
                }
                n >= 50 -> {
                    stringBuilder.append("L")
                    n %= 50
                }
                n >= 40 -> {
                    stringBuilder.append("XL")
                    n %= 40
                }
                n >= 10 -> {
                    stringBuilder.append("X".repeat(n / 10))
                    n %= 10
                }
                n == 9 -> {
                    stringBuilder.append("IX")
                    n %= 9
                }
                n >= 5 -> {
                    stringBuilder.append("V")
                    n %= 5
                }
                n == 4 -> {
                    stringBuilder.append("IV")
                    n %= 4
                }
                n > 0 -> {
                    stringBuilder.append("I".repeat(n / 1))
                    n = 0
                }
            }
        }
        return stringBuilder.toString()
    }
}

fun main() {
    for (i in 1..3999) {
        println(i)
    }
}