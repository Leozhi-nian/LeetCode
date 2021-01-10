package com.leozhi.topic228;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 一次遍历
 * 通过
 * 10ms
 */
public class Solution02 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int left = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i + 1 == len || nums[i] + 1 != nums[i + 1]) {
                res.add(nums[left] + (left == i ? "" : "->") + nums[i]);
                left = i + 1;
            }
        }
        return res;
    }
}
