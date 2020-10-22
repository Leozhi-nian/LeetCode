package com.leozhi.topic771;

/**
 * @author leozhi
 * indexOf()
 * 通过
 * 1ms
 */
public class Solution03 {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        for (char c : S.toCharArray()) {
            if (J.indexOf(c) != -1) {
                res++;
            }
        }
        return res;
    }
}
