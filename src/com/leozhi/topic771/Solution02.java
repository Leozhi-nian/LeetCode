package com.leozhi.topic771;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 3ms
 */
public class Solution02 {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        for (int i = 0; i < J.length(); i++) {
            if (map.containsKey(J.charAt(i))) {
                res += map.get(J.charAt(i));
            }
        }
        return res;
    }
}
