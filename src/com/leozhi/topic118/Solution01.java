package com.leozhi.topic118;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leozhi
 * 数学
 * 通过
 * 1ms
 */
public class Solution01 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        List<Integer> list0 = Collections.singletonList(1);
        res.add(list0);
        if (numRows == 1) {
            return res;
        }
        for (int i = 1; i < numRows; ++i) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(j, 1);
                } else {
                    list.add(j, res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(list);
        }
        return res;
    }
}
