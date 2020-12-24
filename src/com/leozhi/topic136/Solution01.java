package com.leozhi.topic136;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 14ms
 */
public class Solution01 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, 2);
                continue;
            }
            map.put(num, 1);
        }
        for (Integer n : map.keySet()) {
            if (map.get(n) == 1) {
                return n;
            }
        }
        return 0;
    }
}
