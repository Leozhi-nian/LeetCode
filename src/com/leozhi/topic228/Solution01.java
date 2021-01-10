package com.leozhi.topic228;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 一次遍历
 * 通过
 * 0ms
 */
public class Solution01 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int len = nums.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                if (sb.length() != 0) {
                    sb.append("->");
                }
                sb.append(nums[i]);
                res.add(sb.toString());
                break;
            }
            if (nums[i] + 1 == nums[i + 1]) {
                if (sb.length() == 0) {
                    sb.append(nums[i]);
                }
            } else {
                if (sb.length() == 0) {
                    sb.append(nums[i]);
                } else {
                    sb.append("->").append(nums[i]);
                }
                res.add(sb.toString());
                sb.setLength(0);
            }
        }
        return res;
    }
}
