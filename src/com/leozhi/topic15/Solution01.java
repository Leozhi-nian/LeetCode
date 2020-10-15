package com.leozhi.topic15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leozhi
 * 执行结果：
 * 超出时间限制
 */
public class Solution01 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        for (int k = j + 1; k < nums.length; k++) {
                            if (k == j + 1 || nums[k] != nums[k - 1]) {
                                if (nums[i] + nums[j] + nums[k] == 0) {
                                    List<Integer> list = new ArrayList<>();
                                    list.add(nums[i]);
                                    list.add(nums[j]);
                                    list.add(nums[k]);
                                    result.add(list);
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
