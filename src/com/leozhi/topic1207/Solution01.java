package com.leozhi.topic1207;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leozhi
 * 集合 + 快慢指针
 * 通过
 * 1ms
 */
public class Solution01 {
    public boolean uniqueOccurrences(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        Arrays.sort(arr);
        Set<Integer> times = new HashSet<>();
        int count = 0;
        int slow = 0, fast = 0;
        while (fast < arr.length) {
            // 遇到相同元素，继续向右遍历，直至遇到不同元素或者数组越界
            while (fast < arr.length && arr[slow] == arr[fast]) {
                fast++;
            }
            // 快指针 - 慢指针所得的差即为一个元素重复的次数
            times.add(fast - slow);
            count++;
            slow = fast;
        }
        // 返回元素个数和元素出现次数的个数是否相同
        return count == times.size();
    }
}
