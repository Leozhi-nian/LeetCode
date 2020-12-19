package com.leozhi.interview0105;

/**
 * @author leozhi
 * 双指针
 * 通过
 * 2ms
 */
public class Solution01 {
    public boolean oneEditAway(String first, String second) {
        int len1 = first.length(), len2 = second.length();
        if (Math.abs(len1 - len2) > 1) {
            return false;
        }
        int p1 = 0, p2 = 0, count = 0;
        while (p1 < len1 && p2 < len2) {
            if (first.charAt(p1) == second.charAt(p2)) {
                ++p1;
                ++p2;
            } else if (p1 + 1 < len1 && first.charAt(p1 + 1) == second.charAt(p2)) {
                ++count;
                ++p1;
            } else if (p2 + 1 < len2 && first.charAt(p1) == second.charAt(p2 + 1)) {
                ++count;
                ++p2;
            } else {
                ++count;
                ++p1;
                ++p2;
            }
        }
        return count + Math.abs(p1 - len1 + Math.abs(p2 - len2)) <= 1;
    }
}
