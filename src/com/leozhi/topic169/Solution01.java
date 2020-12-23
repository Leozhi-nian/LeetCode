package com.leozhi.topic169;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 18ms
 */
public class Solution01 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > len / 2) {
                return num;
            }
        }
        return 0;
    }
}
