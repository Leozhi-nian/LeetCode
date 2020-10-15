package com.leozhi.topic349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leozhi
 * 未通过
 */
public class Solution01 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }
        Set<Integer> set = new HashSet<>();
        int[] result = new int[nums1.length];
        int count = 0;
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                result[count++] = i;
            }
        }
        return Arrays.copyOfRange(result, 0, count);
    }
}
