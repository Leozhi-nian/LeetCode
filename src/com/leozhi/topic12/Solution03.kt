package com.leozhi.topic12

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 232ms
 */
class Solution03 {
    fun intToRoman(num: Int): String {
        var n = num
        val intArray = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val romanArray = arrayOf("M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I")
        val builder = StringBuilder()
        while (n > 0) {
            for (i in intArray.indices) {
                while (intArray[i] <= n) {
                    n -= intArray[i]
                    builder.append(romanArray[i])
                }
            }
        }
        return builder.toString()
    }
}