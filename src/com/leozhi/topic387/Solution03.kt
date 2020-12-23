package com.leozhi.topic387

/**
 * @author leozhi
 * indexOf() == lastIndexOf()
 * 通过
 * 260ms
 */
class Solution03 {
    fun firstUniqChar(s: String): Int {
        var res = -1
        for (ch in 'a'..'z') {
            val index = s.indexOf(ch)
            if (index != -1 && s.lastIndexOf(ch) == index) {
                res = if ((res == -1 || index < res)) index else res
            }
        }
        return res
    }
}