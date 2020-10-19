package com.leozhi.topic496;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author leozhi
 * 单调栈 官方题解
 * 通过
 * 5ms
 */
public class Solution02 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        for (int j : nums2) {
            while (!stack.empty() && j > stack.peek()) {
                map.put(stack.pop(), j);
            }
            stack.push(j);
        }
        while (!stack.empty()) {
            map.put(stack.pop(), -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
