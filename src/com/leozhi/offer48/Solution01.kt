package com.leozhi.offer48

/**
 * @author leozhi
 * 滑动窗口
 * 通过
 * 252ms
 */
class Solution01 {
    fun lengthOfLongestSubstring(s: String): Int {
        val window = HashMap<Char, Int>()
        var left = 0
        var right = 0
        var res = 0

        while (right < s.length) {
            // 将字符移入窗口，并右移窗口
            val inChar = s[right++]
            // 更新窗口内数据
            window[inChar] = window.getOrDefault(inChar, 0) + 1

            // 收缩窗口
            while (window[inChar]!! > 1) {
                val outChar = s[left++]
                window[outChar] = window[outChar]!! - 1
            }
            res = if (res > right - left) res else right - left
        }
        return res
    }
}