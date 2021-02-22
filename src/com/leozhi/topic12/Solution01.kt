package com.leozhi.topic12

/**
 * @author leozhi
 * 循环
 * 通过
 * 248ms
 */
class Solution01 {
    fun intToRoman(num: Int): String {
        var n = num
        val builder = StringBuilder()
        while (n != 0) {
            when {
                n >= 1000 -> {
                    builder.append("M".repeat(n / 1000))
                    n %= 1000
                }
                n >= 900 -> {
                    builder.append("CM")
                    n %= 900
                }
                n >= 500 -> {
                    builder.append("D")
                    n %= 500
                }
                n >= 400 -> {
                    builder.append("CD")
                    n %= 400
                }
                n >= 100 -> {
                    builder.append("C".repeat(n / 100))
                    n %= 100
                }
                n >= 90 -> {
                    builder.append("XC")
                    n %= 90
                }
                n >= 50 -> {
                    builder.append("L")
                    n %= 50
                }
                n >= 40 -> {
                    builder.append("XL")
                    n %= 40
                }
                n >= 10 -> {
                    builder.append("X".repeat(n / 10))
                    n %= 10
                }
                n == 9 -> {
                    builder.append("IX")
                    n %= 9
                }
                n >= 5 -> {
                    builder.append("V")
                    n %= 5
                }
                n == 4 -> {
                    builder.append("IV")
                    n %= 4
                }
                n > 0 -> {
                    builder.append("I".repeat(n / 1))
                    n = 0
                }
            }
        }
        return builder.toString()
    }
}