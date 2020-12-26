package com.leozhi.topic205;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 11ms
 */
public class Solution01 {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, t.charAt(i));
            } else {
                if (map.get(ch) != t.charAt(i)) {
                    return false;
                }
            }
        }
        Object[] chars = map.values().toArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
