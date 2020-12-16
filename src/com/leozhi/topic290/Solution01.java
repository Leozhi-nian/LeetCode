package com.leozhi.topic290;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 1ms
 */
public class Solution01 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] strings = s.split(" ");
        int len = pattern.length();
        if (len != strings.length) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            char ch = pattern.charAt(i);
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(strings[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(strings[i])) {
                    return false;
                }
                map.put(ch, strings[i]);
            }
        }
        return true;
    }
}
