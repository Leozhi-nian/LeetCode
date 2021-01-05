package com.leozhi.topic830;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 一次遍历
 * 通过
 * 1ms
 */
public class Solution01 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int start = 0, end = 0, len = s.length(), distance = 0;
        for (int i = 1; i <= len; i++) {
            if (i != len && s.charAt(i) == s.charAt(i - 1)) {
                ++end;
            } else {
                distance = end - start;
                if (distance >= 2) {
                    List<Integer> item = new ArrayList<>();
                    item.add(start);
                    item.add(end);
                    res.add(item);
                }
                start = i;
                end = i;
            }
        }
        return res;
    }
}
