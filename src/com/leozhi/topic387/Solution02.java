package com.leozhi.topic387;

/**
 * @author leozhi
 * indexOf() == lastIndexOf()
 * 通过
 * 2ms
 */
public class Solution02 {
    public int firstUniqChar(String s) {
        int res = -1;
        for (char i = 'a'; i <= 'z';i ++) {
            // 字符串中存在 i 则返回第一个 i 的索引值，否则返回-1
            int index = s.indexOf(i);
            // 判断第一个 i 的索引值是否等于最后一个 i 的索引值
            if (index != -1 && index == s.lastIndexOf(i)) {
                res = (res == -1 || index < res) ? index : res;
            }
        }
        return res;
    }
}
