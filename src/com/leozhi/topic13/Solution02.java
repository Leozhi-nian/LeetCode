package com.leozhi.topic13;

import java.util.HashMap;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 6ms
 */
public class Solution02 {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int pre = map.get(s.charAt(0)), cur = map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            cur = map.get(s.charAt(i));
            if (pre < cur) {
                res -= pre;
            } else {
                res += pre;
            }
            pre = cur;
        }
        res += cur;
        return res;
    }
}
