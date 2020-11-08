package com.leozhi.offer67;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 暴力
 * 通过 3ms
 * 测试用例
 * "   +0 123"
 * "-   234"
 * "0-1"
 */
public class Solution01 {
    public int strToInt(String str) {
        boolean isEnd = true;
        int isPositive = -1;
        long res = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && isEnd) {
                continue;
            }
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                    if (!isEnd) {
                        break;
                    } else {
                        isEnd = false;
                    }
                    isPositive = str.charAt(i) == '+' ? 0 : 1;
                    continue;
                }
                if (isEnd) {
                    return 0;
                } else {
                    break;
                }
            } else {
                isEnd = false;
                list.add(str.charAt(i) - '0');
            }
        }
        int len = list.size() - 1;
        for (Integer integer : list) {
            res += integer * Math.pow(10, len--);
        }
        res = isPositive == 1 ? -res : res;
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)res;
    }
}
