package com.leozhi.topic136;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 集合
 * 通过
 * 842ms
 */
public class Solution02 {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                Integer n = num;
                list.remove(n);
                continue;
            }
            list.add(num);
        }
        return list.get(0);
    }
}
