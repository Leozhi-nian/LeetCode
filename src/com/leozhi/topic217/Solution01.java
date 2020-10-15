package com.leozhi.topic217;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 */
public class Solution01 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 0);
        }
        return false;
    }
}
