package com.leozhi.topic771;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leozhi
 * 集合
 * 通过
 * 2ms
 */
public class Solution06 {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        char[] jChars = J.toCharArray();
        char[] sChars = S.toCharArray();
        for (char j : jChars) {
            set.add(j);
        }
        for (char s : sChars) {
            if (set.contains(s)) {
                res++;
            }
        }
        return res;
    }
}
