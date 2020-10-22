package com.leozhi.topic242;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 29ms
 */
public class Solution01 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }
        if (mapS.size() != mapT.size()) {
            return false;
        } else {
            for (char i = 'a'; i <= 'z'; i++) {
                if (mapS.containsKey(i) && !mapT.containsKey(i)) {
                    return false;
                }
                if (mapT.containsKey(i) && !mapS.containsKey(i)) {
                    return false;
                }
                if (mapS.containsKey(i) && mapT.containsKey(i) && !mapS.get(i).equals(mapT.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
