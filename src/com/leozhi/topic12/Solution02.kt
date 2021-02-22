package com.leozhi.topic12

import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * @author leozhi
 * 硬编码数字
 * 通过
 * 264ms
 */
class Solution02 {
    fun intToRoman(num: Int): String {
        val thousands = arrayOf("", "M", "MM", "MMM")
        val hundreds = arrayOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
        val tens = arrayOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
        val ones = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")

        return "${thousands[num / 1000]}${hundreds[num % 1000 / 100]}${tens[num % 100 / 10]}${ones[num % 10]}"
    }
}