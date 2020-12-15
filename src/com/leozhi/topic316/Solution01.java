package com.leozhi.topic316;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leozhi
 */
public class Solution01 {
    public String removeDuplicateLetters(String s) {
        Set<Character> res = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            res.add(s.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character re : res) {
            stringBuilder.append(re);
        }
        return stringBuilder.toString();
    }
}
