package com.leozhi.topic217;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 5ms
 */
public class Solution03 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
