package com.leozhi.topic496;

import java.util.*;

/**
 * @author leozhi
 * 单调栈
 * 通过
 * 6ms
 */
public class Solution01 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        int[] array = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            map.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums2[i]);
        }
        for (int j : nums1) {
            res.add(map.get(j));
        }
        for (int i = 0; i < res.size(); i++) {
            array[i] = res.get(i);
        }
        return array;
    }
}
