package com.leozhi.topic771;

/**
 * @author leozhi
 * 正则匹配
 * 通过
 * 10ms
 */
public class Solution07 {
    public int numJewelsInStones(String J, String S) {
        // 匹配 J 中字符，并将其替换为 ""
        return S.replaceAll("[^" + J + "]", "").length();
    }
}
