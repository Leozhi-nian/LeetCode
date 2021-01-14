package com.leozhi.topic1018;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 模拟
 * 通过
 * 5ms
 */
public class Solution01 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int len = A.length;
        int pre = 0;
        for (int j : A) {
            pre = ((pre << 1) + j) % 5;
            res.add(pre == 0);
        }
        return res;
    }
}